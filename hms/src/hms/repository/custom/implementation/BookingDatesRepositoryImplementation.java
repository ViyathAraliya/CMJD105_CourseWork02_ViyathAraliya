

package hms.repository.custom.implementation;

import hms.entity.BookingDatesEntity;
import hms.entity.BookingDatesEntityID;
import java.util.List;
import org.hibernate.Session;
import hms.repository.custom.BookingDateRepository;


public class BookingDatesRepositoryImplementation implements BookingDateRepository{

  
    @Override
    public BookingDatesEntity getByID(Integer id, Session session) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public BookingDatesEntity getByName(String name, Session session) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean doesNameExist(String name, Session session) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean isEmpty(Session session) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<BookingDatesEntity> getAll(Session session) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(BookingDatesEntity e, Session session) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    @Override
    public Integer save(BookingDatesEntity e, Session session) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public BookingDatesEntityID saveBooking(BookingDatesEntity bookingDatesEntity, Session session) throws Exception {
        return (BookingDatesEntityID)session.save(bookingDatesEntity);
    }

}
