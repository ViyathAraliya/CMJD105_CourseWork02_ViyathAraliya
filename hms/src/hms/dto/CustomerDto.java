
package hms.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter


public class CustomerDto {

    private Integer id;
    private String name;
    private String nic;
    private String phoneNumber;
    private String email;
    private String address;

    public CustomerDto(String name, String nic, String phoneNumber, String email, String address) {
        this.name = name;
        this.nic = nic;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public CustomerDto(Integer id, String name, String nic, String phoneNumber, String email, String address) {
        this.id = id;
        this.name = name;
        this.nic = nic;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }
    
    public  CustomerDto(){}

   
    
}
