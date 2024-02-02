/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hms.dao.customDao.implementation;

import hms.dao.SessionFactoryConfiguration;
import hms.dao.customDao.UserDao;
import hms.entity.UserEntity;
import org.hibernate.Transaction;
import org.hibernate.Session;

public class UserDaoImplementation implements UserDao {

    Session session = SessionFactoryConfiguration.getInstance().getSession(SessionFactoryConfiguration.SessionType.USER);

    public String save(UserEntity userEntity) throws Exception {
        
        Transaction transaction = session.beginTransaction();
        try {
            Integer id = (Integer)session.save(userEntity);
            String id1=id.toString();
            transaction.commit();
            return id1;
        } catch (Exception e) {
            transaction.rollback();
            return e.getMessage();
        }

    }

}
