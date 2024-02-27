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
@Table(name = "Room")
public class RoomEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RoomID")
    private Integer id;
    

    
    @Column
    private String status;
    
    
    @ManyToOne
    @JoinColumn(name = "catagory_id", nullable = false)
    private CatagoryEntity catagoryEntity;

    @Transient
    @OneToMany(mappedBy ="bookedForDates",targetEntity = BookingDatesEntity.class)
    List<BookingDatesEntity> bookingDateEntities;

    @Transient //untested
    @OneToMany(mappedBy = "reservation_Detail", targetEntity = ReservationDetailEntity.class)
    List<ReservationDetailEntity> reservationDetailsEntities;

    public RoomEntity(Integer id, String status, CatagoryEntity catagoryEntity) {
        this.id = id;
        this.status = status;
        this.catagoryEntity = catagoryEntity;
    }

    
    
}
