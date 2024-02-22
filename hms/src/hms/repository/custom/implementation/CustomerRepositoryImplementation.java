
package hms.repository.custom.implementation;

import hms.entity.CustomerEntity;
import hms.entity.UserEntity;
import hms.repository.custom.CustomerRepository;
import hms.util.SessionFactoryConfiguration;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class CustomerRepositoryImplementation implements CustomerRepository{

    Session session=SessionFactoryConfiguration.getInstance().getSession();
    
    
    @Override
    public Integer save(CustomerEntity customerEntity) throws Exception {
        Transaction transaction=session.beginTransaction();
        try {
            Integer id = (Integer) session.save(customerEntity);
            transaction.commit();
            return id;
        } catch (Exception e) {
            transaction.rollback();
            return -1;
        }
    }

    @Override
    public CustomerEntity getByName(String nic) throws Exception {
         throw new UnsupportedOperationException("Not supported yet."); 
    }
    public CustomerEntity getByNic(String nic) throws Exception{
        String hql = "FROM CustomerEntity WHERE nic='" + nic + "'";
            List list = session.createQuery(hql).getResultList();
            CustomerEntity customerEntity = (CustomerEntity) list.get(0);
            return customerEntity;
    }

    @Override
    public boolean doesNameExist(String name) throws Exception {
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

    @Override
    public CustomerEntity getByID(Integer id) throws Exception {
       throw new UnsupportedOperationException("Not supported yet.");   
    }

    @Override
    public boolean doesCustomerExists(String nic) throws Exception {
       String hql = "select 1 from CustomerEntity where exists (select 1 from CustomerEntity  where nic='"
                + nic + "')";
        return session.createQuery(hql).uniqueResult() != null;
    }

}
