
package hms.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;




@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
@Table(name="Package")

public class PackageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="PackageNumber")
    private Integer id;
    
    @Column(name="description")
    private String description;
    
    @Column(name="chargeForPackage")
    private Integer charge;

    public PackageEntity(String description, Integer charge) {
        this.description = description;
        this.charge = charge;
    }
    
    @Transient //untested
    @OneToMany(mappedBy = "reservation_Detail", targetEntity = ReservationDetailEntity.class)
    List<ReservationDetailEntity> reservationDetails;
    
   /* @ManyToMany
    @JoinTable(
    name="package_room",
         joinColumns = {@JoinColumn(name="package_id")},
         inverseJoinColumns = {@JoinColumn(name="room_id")})
    private List<RoomEntity> roomEntity;*/
    
    
}
