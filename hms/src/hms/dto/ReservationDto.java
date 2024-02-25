

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
    
    private Integer reservationID;
     private Date time_of_booking;
    private Date check_in_date;
    private Date check_out_date;
    private List<BookingDatesDto> bookingDatesDtos;
    
    private CustomerDto customerDto;
    
    private List<ReservationDetailDto> reservationDetailDtos;

    public ReservationDto(Date time_of_booking, Date check_in_date, Date check_out_date, List<BookingDatesDto> bookingDatesDtos, CustomerDto customerDto, List<ReservationDetailDto> reservationDetailDtos) {
        this.time_of_booking = time_of_booking;
        this.check_in_date = check_in_date;
        this.check_out_date = check_out_date;
        this.bookingDatesDtos = bookingDatesDtos;
        this.customerDto = customerDto;
        this.reservationDetailDtos = reservationDetailDtos;
    }
    
   
  

}
