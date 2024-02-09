
package hms.util.custom.implementation;



import hms.entity.UserEntity;
import hms.util.custom.UserSessionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UserSessionFacConfigImpl implements UserSessionFactory{
    
   
    private SessionFactory sessionFactory;
    
    public UserSessionFacConfigImpl(){
         Configuration configuration=new Configuration().configure()
                 .addAnnotatedClass(UserEntity.class);
         sessionFactory=configuration.buildSessionFactory();
    }
    
    
    public Session getSession(){
    
    return sessionFactory.openSession();}
    
}
