
package hms.dao.customRepository;

import hms.dao.CrudRepository;
import hms.dao.SuperRepository;
import hms.entity.UserEntity;


public interface UserRepository extends CrudRepository<UserEntity, String>{
    
}
