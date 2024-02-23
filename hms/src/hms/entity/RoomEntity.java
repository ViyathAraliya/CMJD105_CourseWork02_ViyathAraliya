
package hms.entity;


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
    
  
    @Column(name="booked_from")
    private Date check_in_date;
    
    @Column(name="booked_till")
    private Date check_out_date;

    public RoomEntity(Integer id, Date check_in_date, Date check_out_date, CatagoryEntity catagoryEntity) {
        this.id = id;
        this.check_in_date = check_in_date;
        this.check_out_date = check_out_date;
        this.catagoryEntity = catagoryEntity;
    }
    
   
    
    
 @ManyToOne
 @JoinColumn(name="catagory_id", nullable=false)
 private CatagoryEntity catagoryEntity;
 
 @Transient //untested
    @OneToMany(mappedBy = "reservation_Detail", targetEntity = ReservationDetailEntity.class)
    List<ReservationDetailEntity> reservationDetails;
    
 
 
}
