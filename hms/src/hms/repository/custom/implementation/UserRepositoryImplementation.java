package hms.repository.custom.implementation;


import hms.repository.custom.UserRepository;
import hms.entity.UserEntity;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;



public class UserRepositoryImplementation implements UserRepository {


    public String save(UserEntity userEntity,Session session) {
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

    public UserEntity getByName(String userName,Session session) {
       
            String hql = "FROM UserEntity WHERE userName='" + userName + "'";
            List list = session.createQuery(hql).getResultList();
            UserEntity userEntity = (UserEntity) list.get(0);
            return userEntity;

    }

    public boolean doesNameExist(String name,Session session) {

        String hql = "select 1 from UserEntity where exists (select 1 from UserEntity  where userName='"
                + name + "')";
        return session.createQuery(hql).uniqueResult() != null;
    }

    public boolean isEmpty(Session session) {

        List list = session.createQuery("from UserEntity").getResultList();
        System.out.println("size : " + list.size());
        return list.size() == 0;

    }

    public ArrayList<UserEntity> getAll(Session session) {
        return null;
    }

    @Override
    public boolean update(UserEntity e,Session session) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public UserEntity getByID(String id,Session session) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
