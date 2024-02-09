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

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
@Table(name="Catagory")
public class CatagoryEntity {

    
    @Id
    @Column(name="catagoryid")
     @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column(name="catagoryName")
    private String name;
    
    @Column(name="description")
    private String description;
    
    @Column(name="chargeforcatagory")
    private String chargeForCatagory;
    
public CatagoryEntity(String name, String description, String chargeForCatagory) {
        this.name = name;
        this.description = description;
        this.chargeForCatagory = chargeForCatagory;
    }
}
