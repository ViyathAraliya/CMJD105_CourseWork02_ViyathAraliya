package hms.service.custom.implementation;

import hms.repository.RepositoryFactory;

import hms.repository.custom.UserRepository;
import hms.dto.UserDto;
import hms.entity.UserEntity;
import hms.service.custom.UserService;
import hms.util.SessionFactoryConfiguration;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserServiceImplementation implements UserService {

    Session session = SessionFactoryConfiguration.getInstance().getSession();
    UserRepository userRepository = (UserRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryType.USER);

    public String saveUser(UserDto userDto) throws Exception {
        Transaction transaction=session.beginTransaction();
        UserEntity userEntity = new UserEntity(userDto.getName(), userDto.getRole(),
                userDto.getEmail(), userDto.getPhoneNumber(), userDto.getPassword(),userDto.isKeep_logged_in());
        transaction.commit();
        return userRepository.save(userEntity, session);
    }

    public UserDto getUser(String name) throws Exception {
        UserEntity userEntity = userRepository.getByName(name, session);
        return new UserDto(userEntity.getUserName(), userEntity.getRole(), userEntity.getEmail(), userEntity.getPhoneNumber(),
                userEntity.getPassword(), userEntity.isKeep_logged_in());
    }

    public boolean doesUserNameExist(String userName) throws Exception {
        return userRepository.doesNameExist(userName, session);
    }

    public boolean isEmpty() {
        return userRepository.isEmpty(session);
    }

    public String setKeepLoggedInStatus(UserDto userDto) throws Exception {
        Transaction transaction = session.beginTransaction();
        Integer userId = userRepository.getByName(userDto.getName(), session).getId();

        UserEntity userEntity = new UserEntity(userId, userDto.getName(), userDto.getRole(), userDto.getEmail(), userDto.getPhoneNumber(), userDto.getPassword(), userDto.isKeep_logged_in());

        List<UserEntity> entities = userRepository.getAll(session);

        for (int i = 0; i < entities.size(); i++) {
            UserEntity e = entities.get(i);
            if (e.getId() != userId && e.isKeep_logged_in() == true) {
                e.setKeep_logged_in(false);
                if (userRepository.update(e, session)) {
                    return "error in updating keep logged in status";
                }

            }
        }

        if (userRepository.setKeepLoggedInStatus(userEntity, session)) {
            transaction.commit();
            return "success";
        } else {
            return "error in setting logged in status";
        }
    }

    public List<UserDto> getAll() throws Exception {
        List<UserEntity> entities = userRepository.getAll(session);
        List<UserDto> dtos = new ArrayList<>();
        for (UserEntity e : entities) {
            dtos.add(new UserDto(e.getUserName(), null, null, null, e.getPassword(), e.isKeep_logged_in()));
        }
        return dtos;
    }
}
