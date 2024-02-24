

package hms.dto;

import java.util.Date;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ReservationDto {
    
    
     private Date time_of_booking;
    private Date check_in_date;
    private Date checj_out_date;
    private List<BookingDatesDto> bookingDatesDtos;
    
    private CustomerDto customerDto;
    
    private List<ReservationDetailDto> reservationDetailDtos;
   
  

}
