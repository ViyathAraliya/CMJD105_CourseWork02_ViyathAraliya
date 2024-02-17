
package hms.entity;

//import javax.persistence.CollectionTable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
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
import lombok.EqualsAndHashCode;
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
@Table(name="Reservation")
@EqualsAndHashCode
public class ReservationEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ReservationID")
    private Integer id;
    
  //  @Column(name="customerID")
    //private Integer customerId;
    @Column(name="time_of_booking")
    private Date time_of_booking;
  
    
    @Column(name="check_in_Date")
    private  Date check_in_Date;
    
    @Column(name="check_out_Date")
    private Date check_out_date;

   
    @ManyToOne(cascade = CascadeType.ALL    )
    @JoinColumn(name="Custumer_ID",nullable = false)
    private CustomerEntity customerEntity;
    
    @Transient
    @OneToMany(mappedBy = "reservationDetailEntity", targetEntity = ReservationDetailEntity.class)
    private List<ReservationDetailEntity>  reservationDetailEntities;
    
}
