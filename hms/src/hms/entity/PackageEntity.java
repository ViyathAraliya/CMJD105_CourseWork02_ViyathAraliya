
package hms.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
@Table(name="Package")

public class PackageEntity  implements  Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="PackageNumber")
    private Integer id;
    
    @Column(name="description")
    private String description;
    
    @Column(name="chargeForPackage")
    private String charge;

    public PackageEntity(String description, String charge) {
        this.description = description;
        this.charge = charge;
    }
    
   /* @ManyToMany
    @JoinTable(
    name="package_room",
         joinColumns = {@JoinColumn(name="package_id")},
         inverseJoinColumns = {@JoinColumn(name="room_id")})
    private List<RoomEntity> roomEntity;*/
    
    
}
