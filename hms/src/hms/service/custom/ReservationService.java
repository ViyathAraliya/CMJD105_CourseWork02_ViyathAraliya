
package hms.service.custom;

import hms.dto.ReservationDetailDto;
import hms.dto.ReservationDto;
import hms.service.SuperService;
import java.util.List;


public interface ReservationService extends SuperService{
 String saveReservation(ReservationDto reservationDto)throws Exception;
    List<ReservationDto> getAll() throws Exception;
  String deleteReservation(Integer reservationID) throws Exception;
    List<ReservationDetailDto> getReservationDetailsByID(Integer id) throws Exception ;
     ReservationDto getByID(Integer id)throws Exception;
    
}
