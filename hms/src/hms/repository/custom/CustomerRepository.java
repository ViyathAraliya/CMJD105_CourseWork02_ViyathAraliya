
package hms.repository.custom;

import hms.entity.CustomerEntity;
import hms.repository.CrudRepository;
import org.hibernate.Session;


public interface CustomerRepository extends CrudRepository<CustomerEntity, Integer>{
   boolean doesCustomerExists(String nic,Session session) throws Exception;
   CustomerEntity getByNic(String nic,Session session) throws Exception;
    
}
