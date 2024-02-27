
package hms.dto;

import java.util.Date;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class RoomDto {
    private Integer roomId;
   private CatagoryDto catagoryDto;
   private List<BookingDatesDto> bookingDatesDtos;
   
   private String status;

    public RoomDto(Integer roomId, CatagoryDto catagoryDto, String status) {
        this.roomId = roomId;
        this.catagoryDto = catagoryDto;
        this.status = status;
    }

    public RoomDto(CatagoryDto catagoryDto) {
        this.catagoryDto = catagoryDto;
       
    }

   
   
   
}
