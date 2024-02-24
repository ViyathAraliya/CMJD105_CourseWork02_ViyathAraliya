
package hms.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Embeddable
public class BookingDatesEntityID implements Serializable{
     @ManyToOne
    @JoinColumn(name="roomID")
    private RoomEntity roomEntity;
     
     private Date check_in_Date;
     private Date check_out_Date;
    
 
}
