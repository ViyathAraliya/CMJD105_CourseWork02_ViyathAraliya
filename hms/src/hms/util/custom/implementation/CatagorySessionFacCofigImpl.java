package hms.util.custom.implementation;

import hms.entity.CatagoryEntity;
import hms.entity.UserEntity;
import hms.util.custom.CatagorySessionFactory;
import hms.util.custom.UserSessionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CatagorySessionFacCofigImpl implements CatagorySessionFactory {


    private SessionFactory sessionFactory;

    public CatagorySessionFacCofigImpl() {
        Configuration configuration = new Configuration().configure()
                .addAnnotatedClass(CatagoryEntity.class);
        
        sessionFactory=configuration.buildSessionFactory();
    }

   
    public Session getSession(){
        return sessionFactory.openSession();}
public void hellop(){
}
}
