package hms.entity;


import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import javax.persistence.Table;
import lombok.AllArgsConstructor;


@AllArgsConstructor
@Entity
@Table(name="reservation_detail")
public class ReservationDetailEntity{
    @EmbeddedId
  //  @Column(name="ij")
    private ReservationDetailEntityID id=new ReservationDetailEntityID();
    
  /*  @ManyToOne
    @JoinColumn(name="reservationID",nullable = false)
    private ReservationEntity reservationEntity; */
}
