package hms.util;

import hms.entity.UserEntity;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

public class UserSessionFactoryConfiguration {

    private static UserSessionFactoryConfiguration userSessionFactoryConfiguration;
    private SessionFactory sessisonFactory;

    private UserSessionFactoryConfiguration() {
        Configuration configuration = new Configuration().configure()
                .addAnnotatedClass(UserEntity.class);
        sessisonFactory = configuration.buildSessionFactory();
    }

    public static UserSessionFactoryConfiguration getInstance() {
        if (userSessionFactoryConfiguration == null) {
            userSessionFactoryConfiguration = new UserSessionFactoryConfiguration();
        }
        return userSessionFactoryConfiguration;
    }
    
    public Session getSession(){
        return sessisonFactory.openSession();}

}
