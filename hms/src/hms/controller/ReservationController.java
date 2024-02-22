
package hms.controller;

import hms.dto.ReservationDto;
import hms.service.ServiceFactory;
import hms.service.custom.ReservationService;


public class ReservationController {
    ReservationService reservationService=(ReservationService)ServiceFactory
            .getInstance().getService(ServiceFactory.ServiceType.RESERVATION);
    public String makeReservation(ReservationDto reservationDto) throws Exception{
        return  reservationService.saveReservation(reservationDto);
    
    }

}
