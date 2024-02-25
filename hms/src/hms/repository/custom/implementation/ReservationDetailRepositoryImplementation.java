
package hms.repository.custom.implementation;

import hms.entity.ReservationDetailEntity;
import hms.entity.ReservationDetailID;
import hms.repository.custom.ReservationDetailRepository;

import java.util.List;
import org.hibernate.Session;



public class ReservationDetailRepositoryImplementation implements ReservationDetailRepository{

   
    
    public ReservationDetailID saveReservationDetail(ReservationDetailEntity reservationDetailEntity,Session session) throws Exception {
       
           ReservationDetailID id=(ReservationDetailID)session.save(reservationDetailEntity);
           
          
            return id ;
      
    }
    

    @Override
    public ReservationDetailEntity getByName(String name,Session session) throws Exception {
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
    public List<ReservationDetailEntity> getAll(Session session) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean update(ReservationDetailEntity e,Session session) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public ReservationDetailEntity getByID(Integer id,Session session) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Integer save(ReservationDetailEntity e,Session session) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Integer deleteByID(Integer id, Session session) throws Exception {
      return session.createQuery("delete from ReservationDetailEntity where reservationID='"+id+"'").executeUpdate();
      
    }
    

}
