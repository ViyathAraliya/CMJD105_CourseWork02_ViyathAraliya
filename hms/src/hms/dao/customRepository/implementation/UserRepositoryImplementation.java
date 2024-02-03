package hms.dao.customRepository.implementation;

import hms.dao.SessionFactoryConfiguration;
import hms.dao.customRepository.UserRepository;
import hms.entity.UserEntity;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

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
            String str="SELECT*FROM User WHERE userName="+userName;
            Query query=session.createQuery(str);
            List list=query.getResultList();
            return new UserEntity((Integer)list.get(0),(String)list.get(1),(String)list.get(2),
                    (String)list.get(3),(String)list.get(4),(String)list.get(5));
        } catch (Exception e) {
            return null;
        }
    }
}
