
package hms.service.custom;

import hms.dto.CatagoryDto;
import hms.service.SuperService;
import java.util.List;


public interface CatagoryService extends SuperService{
    public List<CatagoryDto> getAll() throws Exception;
    public CatagoryDto getById(Integer id) throws Exception;
    public CatagoryDto getByName(String name)throws Exception;
}

