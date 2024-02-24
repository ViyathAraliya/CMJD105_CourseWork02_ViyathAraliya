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
import hms.repository.custom.implementation.BookingDatesRepositoryImplementation;

import hms.service.custom.ReservationService;
import hms.util.SessionFactoryConfiguration;
import java.util.ArrayList;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import hms.repository.custom.BookingDateRepository;

public class ReservationServiceImplementation implements ReservationService {
    // Session session=SessionFactoryConfiguration.getInstance().getSession();

    @Override
    public String saveReservation(ReservationDto reservationDto) throws Exception {

        Session session = SessionFactoryConfiguration.getInstance().getSession();

        Transaction transcation = session.beginTransaction();

        CustomerRepository customerRepository = (CustomerRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryType.CUSTOMER);
        ReservationRepository reservationRepository = (ReservationRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryType.RESERVATION);
        RoomRepository roomRepository = (RoomRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryType.ROOM);
        PackageRepository packageRepository = (PackageRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryType.PACKAGE);
        CatagoryRepository catagoryRepository = (CatagoryRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryType.CATAGORY);
        BookingDateRepository bookingDateRepository=(BookingDateRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryType.BOOKING_DATES);
        
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

            ReservationEntity reservationEntity = new ReservationEntity(reservationDto.getTime_of_booking(), reservationDto.getCheck_in_date(), reservationDto.getChecj_out_date(), customerEntity);
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
                ReservationDetailID reservationDetailID_saved = (ReservationDetailID) session.save(reservationDetailEntity);
                if (reservationDetailID_saved == null) {
                    transcation.rollback();
                    return "error in saving reservation detail";
                }
               
                
            }
            
            List<BookingDatesDto> bookingDatesDtos=reservationDto.getBookingDatesDtos();
            for(BookingDatesDto bookingDatesDto:bookingDatesDtos){
                    RoomEntity roomEntity=roomRepository.getByID(bookingDatesDto.getRoomId(), session);
                BookingDatesEntityID bookingDatesEntityID=new BookingDatesEntityID(roomEntity, bookingDatesDto.getCheckInDate(), bookingDatesDto.getCheckOutDate());
                BookingDatesEntity bookingDatesEntity=new BookingDatesEntity(bookingDatesEntityID,reservationEntityID);
                BookingDatesEntityID saved_bookingDatesEntityID=bookingDateRepository.saveBooking(bookingDatesEntity, session);
               if(saved_bookingDatesEntityID==null){
                   return "booking saving error";}
            }
            
            transcation.commit();

            return "success";

        } catch (Exception ex) {
            transcation.rollback();
            return ex.getMessage();

        }

    }
}
