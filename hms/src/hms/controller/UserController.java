/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hms.controller;

import hms.dto.UserDto;
import hms.service.ServiceFactory;
import hms.service.custom.UserService;

/**
 *
 * @author viyat
 */
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

}
