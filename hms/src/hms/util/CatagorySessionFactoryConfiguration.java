package hms.util;

import hms.entity.CatagoryEntity;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

public class CatagorySessionFactoryConfiguration {

    private static CatagorySessionFactoryConfiguration catagorySessionFactoryConfiguration;
    private SessionFactory sessionFactory;

    public CatagorySessionFactoryConfiguration() {
        Configuration configuration = new Configuration().configure()
                .addAnnotatedClass(CatagoryEntity.class);
        sessionFactory = configuration.buildSessionFactory();
    }

    public static CatagorySessionFactoryConfiguration getInstance() {
        if (catagorySessionFactoryConfiguration == null) {
            catagorySessionFactoryConfiguration = new CatagorySessionFactoryConfiguration();
        }
        return catagorySessionFactoryConfiguration;
    }

    public Session getSession() {
        return sessionFactory.openSession();
    }
}
