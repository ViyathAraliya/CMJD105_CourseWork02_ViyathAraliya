

package hms.entity;


import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class ReservationDetailEntityID implements Serializable{
    
      @ManyToOne 
    @JoinColumn(name="packageId")
    private PackageEntity pacakage;
    

    @ManyToOne 
    @JoinColumn(name="roomId")
    private RoomEntity room;
    
  
}
