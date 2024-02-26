
package hms.repository.custom;

import hms.entity.ReservationDetailEntity;
import hms.entity.ReservationDetailID;
import hms.entity.ReservationEntity;
import hms.repository.CrudRepository;
import java.util.List;
import org.hibernate.Session;


public interface ReservationDetailRepository extends CrudRepository<ReservationDetailEntity, Integer>{
   ReservationDetailID saveReservationDetail(ReservationDetailEntity reservationDetailEntity,Session session) throws Exception;
    List<ReservationDetailEntity> getListByReservationID(Integer reservationID,Session session) throws Exception;
    List<ReservationDetailEntity> getListByPackageID(Integer packageID,Session session) throws Exception;
}
