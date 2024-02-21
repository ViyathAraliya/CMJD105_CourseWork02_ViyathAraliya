
package hms.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
//import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
//import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

@Entity
@Table(name="Room")
public class RoomEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="RoomID")
    private Integer id;
    
   
  
    @Column(name="catagory")
    private String catagory;

    @Column(name="booked_From")
    private Date bookedFrom;
    
    @Column(name="booked_Till")
    private Date bookedTill;
    
    
    public RoomEntity(String catagory) {
        this.catagory = catagory;
    }
    
    
 @ManyToOne
 @JoinColumn(name="catagory_id", nullable=false)
 private CatagoryEntity catagoryEntity;
 
 @Transient //untested
    @OneToMany(mappedBy = "reservation_Detail", targetEntity = ReservationDetailEntity.class)
    List<ReservationDetailEntity> reservationDetails;
    
 
 
}
