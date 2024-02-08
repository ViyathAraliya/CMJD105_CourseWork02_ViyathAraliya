/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hms.entity;

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
@Getter
@Setter
@NoArgsConstructor
@ToString

@Entity
@Table(name = "Customer")
public class CustomerEntity {

    @Id
    @Column(name = "CustID")
    @GeneratedValue(strategy = GenerationType.AUTO)
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
    
    @Column(name="Number of nights")
    private Integer noOfNight;
   
    public CustomerEntity(String name,String nic, String phoneNumber,String email, String address ){
        this.name=name;
        this.nic=nic;
        this.phoneNumber=phoneNumber;
        this.email=email;
        this.address=address;
    }
   
    

}
