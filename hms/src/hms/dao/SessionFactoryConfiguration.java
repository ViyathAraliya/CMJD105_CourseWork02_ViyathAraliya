
package hms.dao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import hms.entity.UserEntity;

public class SessionFactoryConfiguration{

    private static SessionFactoryConfiguration sessionFactoryConfiguration;
    private SessionFactory userSessionFactory;
    

    private SessionFactoryConfiguration(){
        Configuration configuration = new Configuration().configure().
                addAnnotatedClass(UserEntity.class);
        userSessionFactory = configuration.buildSessionFactory();
    }
    
    
    public static SessionFactoryConfiguration getInstance(){
        if(sessionFactoryConfiguration==null){
            sessionFactoryConfiguration=new SessionFactoryConfiguration();}
         return sessionFactoryConfiguration;}
    
    public Session getSession(SessionType type){
        switch(type){
            case USER:
     return  userSessionFactory.openSession();
            default :return null;
        }
    }
    
    public enum SessionType{
     USER;}
}