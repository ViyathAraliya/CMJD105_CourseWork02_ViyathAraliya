
package hms.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class PackageDto {
    
    private Integer packageID;
    private String description;
    private Integer charge_for_package;
    
    

}
