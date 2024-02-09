/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name="Package")
public class PackageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Package Number")
    private Integer packageID;
    
    @Column(name="description")
    private String description;
    
    @Column(name="charge for package")
    private String charge;

    public PackageEntity(String description, String charge) {
        this.description = description;
        this.charge = charge;
    }
    
    
    
}
