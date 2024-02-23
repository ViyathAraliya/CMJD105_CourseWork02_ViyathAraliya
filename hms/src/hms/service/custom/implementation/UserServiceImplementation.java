package hms.service.custom.implementation;


import hms.repository.RepositoryFactory;

import hms.repository.custom.UserRepository;
import hms.dto.UserDto;
import hms.entity.UserEntity;
import hms.service.custom.UserService;
import hms.util.SessionFactoryConfiguration;
import org.hibernate.Session;


public class UserServiceImplementation implements UserService {
    Session session=SessionFactoryConfiguration.getInstance().getSession();
    UserRepository userRepository=(UserRepository)RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryType.USER);

    public String saveUser(UserDto userDto) throws Exception {
       
        UserEntity userEntity = new UserEntity(userDto.getName(), userDto.getRole(),
                userDto.getEmail(), userDto.getPhoneNumber(), userDto.getPassword());
        
        return userRepository.save(userEntity,session);
    }

    public UserDto getUser(String name) throws Exception {
        UserEntity userEntity = userRepository.getByName(name,session);
        return new UserDto(userEntity.getUserName(), userEntity.getRole(), userEntity.getEmail(), userEntity.getPhoneNumber(),
                userEntity.getPassword());
    }
    public boolean doesUserNameExist(String userName) throws Exception{
     return userRepository.doesNameExist(userName,session);
    }
    
    public boolean isEmpty(){
        return userRepository.isEmpty(session);
        }

}
