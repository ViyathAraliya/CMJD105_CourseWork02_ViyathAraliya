

package hms.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ReservationDetailDto {

    private Integer reservationId;
    private Integer packageID;
    private Integer roomID;
    
    //public ReservationDetailDto(){}

    public ReservationDetailDto(Integer packageID, Integer roomID) {
        this.packageID = packageID;
        this.roomID = roomID;
    }
    
    
    }
