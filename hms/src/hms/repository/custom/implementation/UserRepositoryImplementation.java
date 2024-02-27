package hms.repository.custom.implementation;

import hms.dto.UserDto;
import hms.repository.custom.UserRepository;
import hms.entity.UserEntity;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserRepositoryImplementation implements UserRepository {

    public Integer save(UserEntity userEntity, Session session) {

       return (Integer)session.save(userEntity);

    }

    public UserEntity getByName(String userName, Session session) {

        String hql = "FROM UserEntity WHERE userName='" + userName + "'";
        List list = session.createQuery(hql).getResultList();
        UserEntity userEntity = (UserEntity) list.get(0);
        return userEntity;

    }

    public boolean doesNameExist(String name, Session session) {

        String hql = "select 1 from UserEntity where exists (select 1 from UserEntity  where userName='"
                + name + "')";
        return session.createQuery(hql).uniqueResult() != null;
    }

    public boolean isEmpty(Session session) {

        List list = session.createQuery("from UserEntity").getResultList();
        System.out.println("size : " + list.size());
        return list.size() == 0;

    }

    public List<UserEntity> getAll(Session session) {
        return session.createQuery("FROM UserEntity").getResultList();
    }

    @Override
    public boolean update(UserEntity e, Session session) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public UserEntity getByID(Integer id, Session session) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Integer deleteByID(Integer id, Session session) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean setKeepLoggedInStatus(UserEntity e, Session session) throws Exception {

        if (session.merge(e) == null) {
            return false;
        } else {
            return true;
        }
    }
}
