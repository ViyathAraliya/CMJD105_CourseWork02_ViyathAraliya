

package hms.entity;


import java.io.Serializable;
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
public class ReservationDetailEntityID implements Serializable{
    
    @ManyToOne
    @JoinColumn(name="reservationID")
    private ReservationEntity reservationEntity;
    
    
     @ManyToOne 
    @JoinColumn(name="packageId")
    private PackageEntity pacakageEntity;
    

    @ManyToOne 
    @JoinColumn(name="roomId")
    private RoomEntity roomEntity;
    
  
}
