
package hms.dao.customRepository.implementation;

import hms.dao.SessionFactoryConfiguration;
import hms.dao.customRepository.UserRepository;
import hms.entity.UserEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author viyat
 */
public class UserRepositoryImplementation implements UserRepository{

    private Session session = SessionFactoryConfiguration.getInstance().getSession(SessionFactoryConfiguration.SessionType.USER);

    public Integer save(UserEntity userEntity) {
        Transaction transaction = session.beginTransaction();
        try {
            Integer id = (Integer) session.save(userEntity);
            transaction.commit();
            return id;
        } catch (Exception e) {
            transaction.rollback();
            return -1;
        }
    }
}
