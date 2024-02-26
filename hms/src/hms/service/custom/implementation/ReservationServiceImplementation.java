package hms.service.custom.implementation;

import hms.dto.CatagoryDto;
import hms.dto.BookingDatesDto;
import hms.dto.CustomerDto;
import hms.dto.PackageDto;
import hms.dto.ReservationDetailDto;
import hms.dto.ReservationDto;
import hms.dto.RoomDto;
import hms.entity.CatagoryEntity;
import hms.entity.BookingDatesEntity;
import hms.entity.BookingDatesEntityID;
import hms.entity.CustomerEntity;
import hms.entity.PackageEntity;
import hms.entity.ReservationDetailEntity;
import hms.entity.ReservationDetailID;
import hms.entity.ReservationEntity;
import hms.entity.RoomEntity;
import hms.repository.RepositoryFactory;
import hms.repository.custom.CatagoryRepository;
import hms.repository.custom.CustomerRepository;
import hms.repository.custom.PackageRepository;

import hms.repository.custom.ReservationRepository;
import hms.repository.custom.RoomRepository;

import hms.service.custom.ReservationService;
import hms.util.SessionFactoryConfiguration;
import java.util.ArrayList;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import hms.repository.custom.BookingDateRepository;
import hms.repository.custom.ReservationDetailRepository;

public class ReservationServiceImplementation implements ReservationService {

    // Session session=SessionFactoryConfiguration.getInstance().getSession();
    Session session = SessionFactoryConfiguration.getInstance().getSession();
    ReservationRepository reservationRepository = (ReservationRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryType.RESERVATION);
    ReservationDetailRepository reservationDetailRepository = (ReservationDetailRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryType.RESERVATION_DETAIL);
    BookingDateRepository bookingDateRepository = (BookingDateRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryType.BOOKING_DATES);

    @Override
    public String saveReservation(ReservationDto reservationDto) throws Exception {

        Transaction transcation = session.beginTransaction();

        CustomerRepository customerRepository = (CustomerRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryType.CUSTOMER);

        RoomRepository roomRepository = (RoomRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryType.ROOM);
        PackageRepository packageRepository = (PackageRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryType.PACKAGE);
        CatagoryRepository catagoryRepository = (CatagoryRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryType.CATAGORY);

        try {
            CustomerDto customerDto = reservationDto.getCustomerDto();
            CustomerEntity customerEntity;
            /*saving  customerEntity____________*/
            boolean customer_already_exists = customerRepository.doesCustomerExists(customerDto.getNic(), session);
            if (customer_already_exists) {
                customerEntity = customerRepository.getByNic(customerDto.getNic(), session);
            } else {
                customerEntity = new CustomerEntity(customerDto.getName(), customerDto.getNic(), customerDto.getPhoneNumber(), customerDto.getEmail(), customerDto.getAddress());
                Integer cutomerID = (Integer) session.save(customerEntity);
                if (cutomerID == null || cutomerID == -1) {
                    transcation.rollback();
                    return "error in saving customer";
                }
                customerEntity.setId(cutomerID);
            }
            /*_____________________________________end_customer saving________*/

            ReservationEntity reservationEntity = new ReservationEntity(reservationDto.getTime_of_booking(), reservationDto.getCheck_in_date(), reservationDto.getCheck_out_date(), customerEntity);
            List<ReservationDetailEntity> reservationDetailEntities = new ArrayList<>();

            Integer reservationEntityID = (Integer) session.save(reservationEntity);
            if (reservationEntityID == null || reservationEntityID == -1) {
                transcation.rollback();
                return "error savinf reservation";
            }

            /*----saving reservationdetails----*/
            for (ReservationDetailDto reservationDetailDto : reservationDto.getReservationDetailDtos()) {
                RoomDto roomDto = reservationDetailDto.getRoomDto();
                CatagoryEntity catagoryEntity = catagoryRepository.getByID(roomDto.getCatagoryDto().getId(), session);
                RoomEntity roomEntity = roomRepository.getByID(reservationDetailDto.getRoomDto().getRoomId(), session);

                PackageDto packageDto = reservationDetailDto.getPackageDto();
                PackageEntity packageEntity = packageRepository.getByID(packageDto.getPackageID(), session);

                ReservationDetailID reservationDetailID = new ReservationDetailID(reservationEntity, packageEntity, roomEntity);
                ReservationDetailEntity reservationDetailEntity = new ReservationDetailEntity(reservationDetailID);

                reservationDetailEntities.add(reservationDetailEntity);
                ReservationDetailID reservationDetailID_saved = (ReservationDetailID) reservationDetailRepository.saveReservationDetail(reservationDetailEntity, session);
                if (reservationDetailID_saved == null) {
                    transcation.rollback();
                    return "error in saving reservation detail";
                }

            }

            List<BookingDatesDto> bookingDatesDtos = reservationDto.getBookingDatesDtos();
            for (BookingDatesDto bookingDatesDto : bookingDatesDtos) {
                RoomEntity roomEntity = roomRepository.getByID(bookingDatesDto.getRoomId(), session);
                BookingDatesEntityID bookingDatesEntityID = new BookingDatesEntityID(roomEntity, bookingDatesDto.getCheckInDate(), bookingDatesDto.getCheckOutDate());
                BookingDatesEntity bookingDatesEntity = new BookingDatesEntity(bookingDatesEntityID, reservationEntityID);
                BookingDatesEntityID saved_bookingDatesEntityID = bookingDateRepository.saveBooking(bookingDatesEntity, session);
                if (saved_bookingDatesEntityID == null) {
                    return "booking saving error";
                }
            }

            transcation.commit();

            return "success";

        } catch (Exception ex) {
            transcation.rollback();
            return ex.getMessage();

        }

    }

    @Override
    public List<ReservationDto> getAll() throws Exception {

        List<ReservationEntity> entities = reservationRepository.getAll(session);
        List<ReservationDto> dtos = new ArrayList<>();
        for (ReservationEntity e : entities) {

            CustomerEntity cE = e.getCustomerEntity();
            CustomerDto customerDto = new CustomerDto(cE.getName(), cE.getNic(), cE.getPhoneNumber(), cE.getEmail(), cE.getAddress());

            ReservationDto dto = new ReservationDto();
            dto.setReservationID(e.getId());
            dto.setTime_of_booking(e.getTime_of_booking());
            dto.setCheck_in_date(e.getCheck_in_Date());
            dto.setCheck_out_date(e.getCheck_out_date());
            dto.setCustomerDto(customerDto);
            dtos.add(dto);
        }
        return dtos;
    }

    public String deleteReservation(Integer reservationID) throws Exception {
        Transaction transaction=session.beginTransaction();
        Integer deleted_bookingDates = bookingDateRepository.deleteByID(reservationID, session);
        if (deleted_bookingDates == 0) {
            transaction.rollback();
            return "error  at deleting booking dates";
        }
        Integer deleted_reservationDetails = reservationDetailRepository.deleteByID(reservationID, session);
        if (deleted_reservationDetails == 0) {
            transaction.rollback();
            return "error  at deleting reservation details";
        }
        Integer deleted_reservation = reservationRepository.deleteByID(reservationID, session);
        if (deleted_reservation == 0) {
            transaction.rollback();
            return "error  at deleting reservation";
        }
        transaction.commit();
        return "success";
    }

    @Override
    public List<ReservationDetailDto> getReservationDetailsByID(Integer id) throws Exception {
       List<ReservationDetailEntity> entities=reservationDetailRepository.getListByReservationID(id, session);
       List<ReservationDetailDto> reservationDetailDtos=new ArrayList<>();
       for(ReservationDetailEntity e:entities){
        
         ReservationDetailID resDId=e.getId();
        
        PackageEntity pkgE=resDId.getPacakageEntity();
        RoomEntity roomE=resDId.getRoomEntity();
        CatagoryEntity catE=roomE.getCatagoryEntity();
        
        CatagoryDto catagoryDto=new CatagoryDto(catE.getId(), catE.getName(), catE.getDescription(), catE.getChargeForCatagory());
        PackageDto packageDto=new PackageDto(pkgE.getId(),pkgE.getDescription(),pkgE.getCharge());
        RoomDto roomDto=new RoomDto(roomE.getId(), catagoryDto,roomE.getStatus());
        
        ReservationDetailDto dto=new  ReservationDetailDto(packageDto,roomDto);
        reservationDetailDtos.add(dto);
       
       }
       return reservationDetailDtos;
    }
    
    public ReservationDto getByID(Integer id)throws Exception{
        ReservationEntity e=reservationRepository.getByID(id, session);
        ReservationDto dto=new ReservationDto();
        dto.setCheck_in_date(e.getCheck_in_Date());
        dto.setCheck_out_date(e.getCheck_out_date());
        return dto;
    }
    
    
}
