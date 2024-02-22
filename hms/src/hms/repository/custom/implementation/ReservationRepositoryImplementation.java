

package hms.repository.custom.implementation;

import hms.entity.ReservationDetailEntityID;
import hms.entity.ReservationEntity;
import hms.repository.custom.ReservationRepository;
import hms.util.SessionFactoryConfiguration;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class ReservationRepositoryImplementation implements ReservationRepository{
    Session session=SessionFactoryConfiguration.getInstance().getSession();
    
    @Override
    public Integer save(ReservationEntity reservationEntity) throws Exception {
        Transaction transaction=session.beginTransaction();
       try {
            Integer id = (Integer) session.save(reservationEntity);
            transaction.commit();
            return id;
        } catch (Exception e) {
            transaction.rollback();
            return -1;
        }
    }

    @Override
    public ReservationEntity getByName(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean doesNameExist(String name) throws Exception {
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

    @Override
    public boolean update(ReservationEntity e) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public ReservationEntity getByID(Integer id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
