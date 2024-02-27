
package hms.dto;

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

public class CatagoryDto {
    
    private Integer id;
    private String catagoryName;
    private String description;
    private Integer chargeForCatagory;

    public CatagoryDto(String catagoryName, String description, Integer chargeForCatagory) {
        this.catagoryName = catagoryName;
        this.description = description;
        this.chargeForCatagory = chargeForCatagory;
    }
    
    
}
