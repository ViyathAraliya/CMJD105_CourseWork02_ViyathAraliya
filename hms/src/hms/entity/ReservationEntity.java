/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hms.entity;

//import javax.persistence.CollectionTable;
import javax.persistence.Column;
//import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
import javax.persistence.Table;

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
@Table(name="Reservation")
public class ReservationEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ReservationID")
    private Integer id;
    
    @Column(name="customerID")
    private Integer customerId;
    
    @Column(name="roomID")
    private Integer roomID;
    
    @Column(name="packageID")
    private Integer packageID;
    
    @Column(name="number of nights")
    private  Integer noOfNights; 

    public ReservationEntity(Integer customerId, Integer roomID, Integer packageID, Integer noOfNights) {
        this.customerId = customerId;
        this.roomID = roomID;
        this.packageID = packageID;
        this.noOfNights = noOfNights;
    }
    
    
}
