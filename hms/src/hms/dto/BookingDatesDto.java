package hms.dto;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class BookingDatesDto {

    private Integer roomId;
    private Date checkInDate;
    private Date checkOutDate;

    public BookingDatesDto(Integer roomId, Date checkInDate, Date checkOutDate) {
        this.roomId = roomId;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }
    private Integer reservationID;

    public BookingDatesDto(Date checkInDate, Date checkOutDate, Integer reservationID) {
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.reservationID = reservationID;
    }
    
    
    
}
