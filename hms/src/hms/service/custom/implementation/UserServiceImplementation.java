package hms.service.custom.implementation;


import hms.repository.RepositoryFactory;

import hms.repository.custom.UserRepository;
import hms.dto.UserDto;
import hms.entity.UserEntity;
import hms.service.custom.UserService;

/**
 *
 * @author viyat
 */
public class UserServiceImplementation implements UserService {
    
    UserRepository userRepository=(UserRepository)RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryType.USER);

    public String saveUser(UserDto userDto) throws Exception {
       
        UserEntity userEntity = new UserEntity(userDto.getName(), userDto.getRole(),
                userDto.getEmail(), userDto.getPhoneNumber(), userDto.getPassword());
        
        return userRepository.save(userEntity);
    }

    public UserDto getUser(String name) throws Exception {
        UserEntity userEntity = userRepository.getByName(name);
        return new UserDto(userEntity.getUserName(), userEntity.getRole(), userEntity.getEmail(), userEntity.getPhoneNumber(),
                userEntity.getPassword());
    }
    public boolean doesUserNameExist(String userName) throws Exception{
     return userRepository.doesNameExist(userName);
    }
    
    public boolean isEmpty(){
        return userRepository.isEmpty();
        }

}
