

package hms.repository.custom.implementation;


import hms.entity.ReservationEntity;
import hms.repository.custom.ReservationRepository;

import java.util.List;
import org.hibernate.Session;



public class ReservationRepositoryImplementation implements ReservationRepository{
   
    @Override
    public Integer save(ReservationEntity reservationEntity,Session session) throws Exception {
    
            Integer id = (Integer) session.save(reservationEntity);
            return id;
       
    }

    @Override
    public ReservationEntity getByName(String name,Session session) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean doesNameExist(String name,Session session) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean isEmpty(Session session) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @Override
    public List<ReservationEntity> getAll(Session session) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean update(ReservationEntity e,Session session) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public ReservationEntity getByID(Integer id,Session session) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
