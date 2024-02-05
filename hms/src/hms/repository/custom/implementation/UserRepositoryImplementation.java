package hms.repository.custom.implementation;

import hms.repository.SessionFactoryConfiguration;
import hms.repository.custom.UserRepository;
import hms.entity.UserEntity;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;


/**
 *
 * @author viyat
 */
public class UserRepositoryImplementation implements UserRepository {

    private Session session = SessionFactoryConfiguration.getInstance().getSession(SessionFactoryConfiguration.SessionType.USER);

    public String save(UserEntity userEntity) {
        Transaction transaction = session.beginTransaction();
        try {
            Integer id = (Integer) session.save(userEntity);
            transaction.commit();

            return id.toString();
        } catch (Exception e) {
            transaction.rollback();
            return e.getMessage();
        }
    }

    public UserEntity getByName(String userName) {
        try {
            System.out.print(userName);
            String hql = "FROM UserEntity WHERE userName='"+ userName+"'";
            List list = session.createQuery(hql).getResultList();
            UserEntity userEntity= (UserEntity) list.get(0);
            return userEntity;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public boolean doesNameExist(String name){
    
                String hql="select 1 from UserEntity where exists (select 1 from UserEntity  where userName='"
                     +name+"')";
        return session.createQuery(hql).uniqueResult() != null;
    }
    
    public boolean isEmpty(){
       
        List list=session.createQuery("from UserEntity").getResultList();
        System.out.println("size : "+list.size());
        return list.size()==0;
        
    }
}
