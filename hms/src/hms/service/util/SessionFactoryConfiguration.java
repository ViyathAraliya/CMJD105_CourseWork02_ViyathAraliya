package hms.service.util;

import hms.entity.CatagoryEntity;
import hms.entity.CustomerEntity;
import hms.entity.PackageEntity;
import hms.entity.ReservationDetailEntityID;
import hms.entity.ReservationDetailEntity;
import hms.entity.ReservationEntity;

import hms.entity.RoomEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryConfiguration {

    private static SessionFactoryConfiguration sessionFactoryConfiguration;
    private SessionFactory sessionFactory;

    public SessionFactoryConfiguration() {
        Configuration configuration = new Configuration().configure()
                .addAnnotatedClass(CatagoryEntity.class)
                .addAnnotatedClass(CustomerEntity.class)
                .addAnnotatedClass(ReservationEntity.class)
                .addAnnotatedClass(ReservationDetailEntityID.class)
              .addAnnotatedClass(ReservationDetailEntity.class)
              .addAnnotatedClass(PackageEntity.class)
               .addAnnotatedClass(RoomEntity.class)
                ;
        sessionFactory = configuration.buildSessionFactory();
    }

    public static SessionFactoryConfiguration getSessionFactoryConfiguration() {
        if (sessionFactoryConfiguration == null) {
            sessionFactoryConfiguration = new SessionFactoryConfiguration();
        }
        return sessionFactoryConfiguration;
    }

    public Session getSession() {
        return sessionFactory.openSession();
    }

}
