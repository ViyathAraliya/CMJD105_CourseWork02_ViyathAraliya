
package hms.service.custom;

import hms.dto.CatagoryDto;
import hms.service.SuperService;
import java.util.List;


public interface CatagoryService extends SuperService{
   List<CatagoryDto> getAll() throws Exception;
     CatagoryDto getById(Integer id) throws Exception;
     CatagoryDto getByName(String name)throws Exception;
     String update(CatagoryDto dto) throws Exception;
     String save(CatagoryDto dto) throws Exception;
    
}

