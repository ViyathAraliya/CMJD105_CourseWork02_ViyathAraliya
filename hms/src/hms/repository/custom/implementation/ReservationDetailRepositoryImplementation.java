
package hms.repository.custom.implementation;

import hms.entity.ReservationDetailEntity;
import hms.repository.custom.ReservationDetailRepository;
import hms.util.SessionFactoryConfiguration;
import java.util.List;
import org.hibernate.Session;


public class ReservationDetailRepositoryImplementation implements ReservationDetailRepository{

    Session session=SessionFactoryConfiguration.getInstance().getSession();
    @Override
    public Integer save(ReservationDetailEntity reservationDetailEntity) throws Exception {
     return (Integer)session.save(reservationDetailEntity);
    }

    @Override
    public ReservationDetailEntity getByName(Integer name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean doesNameExist(Integer name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<ReservationDetailEntity> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    

}
