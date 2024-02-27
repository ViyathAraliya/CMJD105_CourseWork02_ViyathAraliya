
package hms.repository.custom;

import hms.dto.UserDto;
import hms.repository.CrudRepository;
import hms.entity.UserEntity;
import org.hibernate.Session;


public interface UserRepository extends CrudRepository<UserEntity, Integer>{
    boolean setKeepLoggedInStatus(UserEntity e,Session session) throws Exception;
           
}
