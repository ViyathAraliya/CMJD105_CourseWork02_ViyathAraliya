
package hms.controller;

import hms.dto.UserDto;
import hms.service.ServiceFactory;
import hms.service.custom.UserService;
import java.util.List;


public class UserController {

    UserService userService = (UserService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.USER);

    public String saveUser(UserDto userDto) throws Exception {
        return userService.saveUser(userDto);
    }

    public UserDto getUser(String userName) throws Exception{
        return userService.getUser(userName);
    }
    
    public boolean doesUserNameExist(String userName)throws Exception{
    return userService.doesUserNameExist(userName);}
    
    public boolean isEmpty(){
      return  userService.isEmpty();            
    }
    
    public String setKeepLoggedInStatus(UserDto userDto)throws Exception{
        return  userService.setKeepLoggedInStatus(userDto);
    }
    
    public List<UserDto> getAll() throws Exception{
        return userService.getAll();
        }

}
