
package hms.repository.custom;

import hms.entity.CustomerEntity;
import hms.repository.CrudRepository;


public interface CustomerRepository extends CrudRepository<CustomerEntity, Integer>{
   boolean doesCustomerExists(String nic) throws Exception;
   CustomerEntity getByNic(String nic) throws Exception;
    
}
