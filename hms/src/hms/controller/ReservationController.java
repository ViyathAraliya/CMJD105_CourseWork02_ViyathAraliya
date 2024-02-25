
package hms.controller;

import hms.dto.ReservationDto;
import hms.service.ServiceFactory;
import hms.service.custom.ReservationService;
import java.util.List;


public class ReservationController {
    ReservationService reservationService=(ReservationService)ServiceFactory
            .getInstance().getService(ServiceFactory.ServiceType.RESERVATION);
    public String makeReservation(ReservationDto reservationDto) throws Exception{
        return  reservationService.saveReservation(reservationDto);
    
    }
    public List<ReservationDto> getAll()throws Exception{
        return reservationService.getAll();
    }
    public String delete(Integer id) throws Exception{
     return reservationService.deleteReservation(id);
     
    }

}
