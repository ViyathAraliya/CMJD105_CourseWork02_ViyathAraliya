
package hms.repository.custom;

import hms.entity.ReservationDetailEntity;
import hms.entity.ReservationDetailEntityID;
import hms.entity.ReservationEntity;
import hms.repository.CrudRepository;
import org.hibernate.Session;


public interface ReservationDetailRepository extends CrudRepository<ReservationDetailEntity, Integer>{
   ReservationDetailEntityID saveReservationDetail(ReservationDetailEntity reservationDetailEntity,Session session) throws Exception;
}
