
package hms.service.custom;


import hms.dto.PackageDto;
import hms.service.SuperService;
import java.util.List;


public interface PackageService  extends SuperService{
    public List<PackageDto> getAll()throws Exception;
    public PackageDto getByDescription(String description) throws Exception;
    
}
