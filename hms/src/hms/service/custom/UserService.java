/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hms.service.custom;

import hms.dto.UserDto;
import hms.service.SuperService;

/**
 *
 * @author viyat
 */
public interface UserService extends SuperService{
    public String saveUser(UserDto userDto)throws Exception;
    public UserDto getUser(String name)throws Exception;
    public boolean doesUserNameExist(String userName) throws Exception;
    public boolean isEmpty();
}
