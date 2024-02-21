
package hms.entity;

import java.util.List;
import javax.persistence.Column;
//import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Getter
@Setter
@NoArgsConstructor
@ToString

@Entity
@Table(name = "Customer")
public class CustomerEntity {

    @Id
    @Column(name = "CustomerID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="Name")
    private String name;
    
    @Column(name = "NIC")
    private String nic;

    @Column(name="PhoneNumber")
    private String phoneNumber;
    
    @Column(name="EMail")
    private String email;
    
    @Column(name="Address")
    private String address;
    

   
    public CustomerEntity(String name,String nic, String phoneNumber,String email, String address ){
        this.name=name;
        this.nic=nic;
        this.phoneNumber=phoneNumber;
        this.email=email;
        this.address=address;
    }
   
    @Transient
    @OneToMany(mappedBy = "customerEntity",targetEntity = ReservationEntity.class)
    List<ReservationEntity> reservationEntities;
    
    

}
