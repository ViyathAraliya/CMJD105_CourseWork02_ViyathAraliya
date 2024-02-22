
package hms.repository.custom;

import hms.entity.ReservationDetailEntity;
import hms.entity.ReservationDetailEntityID;
import hms.entity.ReservationEntity;
import hms.repository.CrudRepository;


public interface ReservationDetailRepository extends CrudRepository<ReservationDetailEntity, Integer>{
   ReservationDetailEntityID saveReservationDetail(ReservationDetailEntity reservationDetailEntity) throws Exception;
}
