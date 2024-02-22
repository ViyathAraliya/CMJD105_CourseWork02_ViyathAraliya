package hms.service.custom.implementation;

import hms.dto.CustomerDto;
import hms.dto.ReservationDetailDto;
import hms.dto.ReservationDto;
import hms.entity.CustomerEntity;
import hms.entity.PackageEntity;
import hms.entity.ReservationDetailEntity;
import hms.entity.ReservationDetailEntityID;
import hms.entity.ReservationEntity;
import hms.entity.RoomEntity;
import hms.repository.RepositoryFactory;
import hms.repository.custom.CustomerRepository;
import hms.repository.custom.PackageRepository;
import hms.repository.custom.ReservationDetailRepository;
import hms.repository.custom.ReservationRepository;
import hms.repository.custom.RoomRepository;
import hms.service.custom.ReservationService;
import hms.util.SessionFactoryConfiguration;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ReservationServiceImplementation implements ReservationService {

    @Override
    public String saveReservation(ReservationDto reservationDto) throws Exception {

        Session session = SessionFactoryConfiguration.getInstance().getSession();
        Transaction transcation = session.beginTransaction();

        CustomerRepository customerRepository = (CustomerRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryType.CUSTOMER);
        ReservationRepository reservationRepository = (ReservationRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryType.RESERVATION);
        ReservationDetailRepository reservationDetailRepository = (ReservationDetailRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryType.RESERVATION_DETAIL);
        PackageRepository packageRepository = (PackageRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryType.PACKAGE);
        RoomRepository roomRepository = (RoomRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryType.ROOM);

        CustomerDto customerDto = reservationDto.getCustomerDto();

        List<ReservationDetailDto> reservationDetailDtos = reservationDto.getReservationDetailDtos();
        List<ReservationDetailEntity> reservationDetailEntities = new ArrayList<>();

        CustomerEntity customerEntity;
        try {
            boolean customer_already_exists = customerRepository.doesCustomerExists(customerDto.getNic());

            if (customer_already_exists) {
                customerEntity = customerRepository.getByNic(customerDto.getNic());
            } else {
                customerEntity = new CustomerEntity(customerDto.getName(), customerDto.getNic(), customerDto.getPhoneNumber(), customerDto.getEmail(), customerDto.getAddress());
                Integer customerID = customerRepository.save(customerEntity);
                if (customerID == null) {
                    transcation.rollback();
                    return "customer saving error";
                }
                customerEntity.setId(customerID);
            }

            ReservationEntity reservationEntity = new ReservationEntity();

            reservationEntity.setTime_of_booking(reservationDto.getTime_of_booking());
            reservationEntity.setCheck_in_Date(reservationDto.getCheck_in_date());
            reservationEntity.setCheck_out_date(reservationDto.getChecj_out_date());
            reservationEntity.setCustomerEntity(customerEntity);

            Integer reservationEntity_id = reservationRepository.save(reservationEntity);

            if (reservationEntity_id == null) {
                 transcation.rollback();
                return "reservation save error";
            }

            reservationEntity.setId(reservationEntity_id);

            for (ReservationDetailDto dto : reservationDetailDtos) {
                PackageEntity packageEntity = packageRepository.getByID(dto.getPackageID());
                RoomEntity roomEntity = roomRepository.getByID(dto.getRoomID());
                ReservationDetailEntityID reservationDetailEntityID = new ReservationDetailEntityID(reservationEntity, packageEntity, roomEntity);
                ReservationDetailEntity reservationDetailEntity = new ReservationDetailEntity(reservationDetailEntityID);
                reservationDetailEntities.add(reservationDetailEntity);
            }

            /*saving reservationDetails*/
            for (ReservationDetailEntity reservationDetailEntity : reservationDetailEntities) {

                ReservationDetailEntityID reservationDetail_id = reservationDetailRepository.saveReservationDetail(reservationDetailEntity);//error here
                if (reservationDetail_id == null) {
                    transcation.rollback();
                    return "reservationDetail saving error";
                }
            }

            

            transcation.commit();

            return "succesfully saved";
        } catch (Exception e) {
            transcation.rollback();
            e.printStackTrace();
            throw e;
        }

    }

}
