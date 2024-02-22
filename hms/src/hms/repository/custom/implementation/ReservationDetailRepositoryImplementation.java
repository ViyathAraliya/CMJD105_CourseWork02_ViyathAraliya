
package hms.repository.custom.implementation;

import hms.entity.ReservationDetailEntity;
import hms.entity.ReservationDetailEntityID;
import hms.repository.custom.ReservationDetailRepository;
import hms.util.SessionFactoryConfiguration;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class ReservationDetailRepositoryImplementation implements ReservationDetailRepository{

    Session session=SessionFactoryConfiguration.getInstance().getSession();
    
    public ReservationDetailEntityID saveReservationDetail(ReservationDetailEntity reservationDetailEntity) throws Exception {
        Transaction transaction=session.beginTransaction();
        try{
           ReservationDetailEntityID id=(ReservationDetailEntityID)session.save(reservationDetailEntity);
            transaction.commit();
            return id ;
        }catch(Exception e ){
        transaction.rollback();
        return null;}
    }
    

    @Override
    public ReservationDetailEntity getByName(String name) throws Exception {
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
    public List<ReservationDetailEntity> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean update(ReservationDetailEntity e) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public ReservationDetailEntity getByID(Integer id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Integer save(ReservationDetailEntity e) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

}
