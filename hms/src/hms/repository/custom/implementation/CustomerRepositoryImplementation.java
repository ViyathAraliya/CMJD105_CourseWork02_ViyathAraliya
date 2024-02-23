
package hms.repository.custom.implementation;

import hms.entity.CustomerEntity;

import hms.repository.custom.CustomerRepository;

import java.util.List;
import org.hibernate.Session;



public class CustomerRepositoryImplementation implements CustomerRepository{

 
    
    @Override
    public Integer save(CustomerEntity customerEntity,Session session) throws Exception {
        
            Integer id = (Integer) session.save(customerEntity);
           
            return id;
       
    }

    @Override
    public CustomerEntity getByName(String nic,Session session) throws Exception {
         throw new UnsupportedOperationException("Not supported yet."); 
    }
    public CustomerEntity getByNic(String nic,Session session) throws Exception{
        String hql = "FROM CustomerEntity WHERE nic='" + nic + "'";
            List list = session.createQuery(hql).getResultList();
            CustomerEntity customerEntity = (CustomerEntity) list.get(0);
            return customerEntity;
    }

    @Override
    public boolean doesNameExist(String name,Session session) throws Exception {
      throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean isEmpty(Session session) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public List<CustomerEntity> getAll(Session session) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean update(CustomerEntity e,Session session) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public CustomerEntity getByID(Integer id,Session session) throws Exception {
       throw new UnsupportedOperationException("Not supported yet.");   
    }

    @Override
    public boolean doesCustomerExists(String nic,Session session) throws Exception {
       String hql = "select 1 from CustomerEntity where exists (select 1 from CustomerEntity  where nic='"
                + nic + "')";
        return session.createQuery(hql).uniqueResult() != null;
    }

}
