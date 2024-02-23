
package hms.dto;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter

public class RoomDto {
    private Integer id;
    private Date check_in_date;
    private Date check_out_date;
   private CatagoryDto catagoryDto;

    public RoomDto(String catagoryName, Date check_in_date, Date check_out_date) {
        
        this.check_in_date = check_in_date;
        this.check_out_date = check_out_date;
    }
   
   
}
