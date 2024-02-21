
package hms.repository.custom.implementation;

import hms.entity.CustomerEntity;
import hms.repository.custom.CustomerRepository;
import hms.util.SessionFactoryConfiguration;
import java.util.List;
import org.hibernate.Session;


public class CustomerRepositoryImplementation implements CustomerRepository{

    Session session=SessionFactoryConfiguration.getInstance().getSession();
    
    
    @Override
    public Integer save(CustomerEntity customerEntity) throws Exception {
      return (Integer) session.save(customerEntity);
    }

    @Override
    public CustomerEntity getByName(Integer name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean doesNameExist(Integer name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public List<CustomerEntity> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean update(CustomerEntity e) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
