
package hms.service.custom;

import hms.dto.RoomDto;
import hms.entity.RoomEntity;
import hms.service.SuperService;
import java.util.ArrayList;
import java.util.List;


public interface RoomService extends  SuperService{
     public List<RoomDto> getAll() throws Exception;
  }
 

