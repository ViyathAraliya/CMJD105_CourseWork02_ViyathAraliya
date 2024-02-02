
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
        UserEntity userEntity = new UserEntity(userDto.getName(),
                userDto.getEmail(), userDto.getPhoneNumber(), userDto.getPassword());
        return userDao.save(userEntity);
    }

}
