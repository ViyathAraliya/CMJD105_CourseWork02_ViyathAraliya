/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hms.entity;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name="User")
public class UserEntity {

    public UserEntity(String userName, String role, String email, String phoneNumber, String password) {
        this.userName = userName;
        this.role=role;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }
    
   
    @Id
    @Column(name="UserID")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    
    @Column(name="User_Name")
    private String userName;
    
    @Column(name="Role")
    private String role;
    
    @Column(name="Email")
    private String email;
    
    @Column(name="Phone_Number")
    private String phoneNumber;
    
    @Column(name="password")
    private String password;
    
    
}
