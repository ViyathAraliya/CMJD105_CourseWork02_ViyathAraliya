
package hms.util;


import hms.entity.RoomEntity;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

public class RoomSessionFactoryConfiguration {

    private static RoomSessionFactoryConfiguration roomSessionFactoryConfiguration;
    private SessionFactory sessisonFactory;

    public RoomSessionFactoryConfiguration() {
        Configuration configuration = new Configuration().configure()
                .addAnnotatedClass(RoomEntity.class);
        sessisonFactory = configuration.buildSessionFactory();
    }

    public static RoomSessionFactoryConfiguration getInstance() {
        if (roomSessionFactoryConfiguration == null) {
            roomSessionFactoryConfiguration = new RoomSessionFactoryConfiguration();
        }
        return roomSessionFactoryConfiguration;
    }
    
    public Session getSession(){
        return sessisonFactory.openSession();}

}


