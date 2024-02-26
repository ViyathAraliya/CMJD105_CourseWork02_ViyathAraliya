
package hms.service.custom;

import hms.dto.UserDto;
import hms.service.SuperService;
import java.util.List;


public interface UserService extends SuperService{
    String saveUser(UserDto userDto)throws Exception;
     UserDto getUser(String name)throws Exception;
     boolean doesUserNameExist(String userName) throws Exception;
    boolean isEmpty();
    String setKeepLoggedInStatus(UserDto userDto) throws Exception;
      List<UserDto> getAll() throws Exception ;
}
