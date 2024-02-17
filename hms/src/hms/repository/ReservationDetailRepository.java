

package hms.repository;

import hms.service.util.SessionFactoryConfiguration;
import org.hibernate.Session;


public class ReservationDetailRepository {

    Session session=SessionFactoryConfiguration.getSessionFactoryConfiguration().getSession();
    
    
}
