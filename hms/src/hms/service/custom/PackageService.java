
package hms.service.custom;


import hms.dto.PackageDto;
import hms.service.SuperService;
import java.util.List;


public interface PackageService  extends SuperService{
     List<PackageDto> getAll()throws Exception;
     PackageDto getByDescription(String description) throws Exception;
     String update(PackageDto dto)throws Exception;
    
}
