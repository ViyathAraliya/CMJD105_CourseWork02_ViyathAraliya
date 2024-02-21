

package hms.repository.custom.implementation;

import hms.entity.ReservationEntity;
import hms.repository.custom.ReservationRepository;
import hms.util.SessionFactoryConfiguration;
import java.util.List;
import org.hibernate.Session;


public class ReservationRepositoryImplementation implements ReservationRepository{
    Session session=SessionFactoryConfiguration.getInstance().getSession();
    
    @Override
    public Integer save(ReservationEntity reservationEntity) throws Exception {
        return (Integer)session.save(reservationEntity);
    }

    @Override
    public ReservationEntity getByName(Integer name) throws Exception {
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
    public List<ReservationEntity> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
