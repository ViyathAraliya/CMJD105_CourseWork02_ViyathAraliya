
package hms.service.custom;

import hms.dto.ReservationDto;
import hms.service.SuperService;


public interface ReservationService extends SuperService{
 String saveReservation(ReservationDto reservationDto)throws Exception;
    
}
