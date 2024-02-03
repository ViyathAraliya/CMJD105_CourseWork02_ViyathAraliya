package hms.service.custom.implementation;

import hms.dao.DaoFactory;
import hms.dao.customDao.UserDao;
import hms.dto.UserDto;
import hms.entity.UserEntity;
import hms.service.custom.UserService;

/**
 *
 * @author viyat
 */
public class UserServiceImplementation implements UserService {

    UserDao userDao = (UserDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.USER);

    public String saveUser(UserDto userDto) throws Exception {
       
        UserEntity userEntity = new UserEntity(userDto.getName(), userDto.getRole(),
                userDto.getEmail(), userDto.getPhoneNumber(), userDto.getPassword());
        
        return userDao.save(userEntity);
    }

    public UserDto getUser(String name) throws Exception {
        UserEntity userEntity = userDao.getByName(name);
        return new UserDto(userEntity.getUserName(), userEntity.getRole(), userEntity.getEmail(), userEntity.getPhoneNumber(),
                userEntity.getPassword());
    }

}
