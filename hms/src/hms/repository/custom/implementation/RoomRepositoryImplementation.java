package hms.repository.custom.implementation;

import hms.entity.BookingDatesEntity;
import hms.entity.RoomEntity;
import hms.repository.custom.RoomRepository;
import java.util.ArrayList;

import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class RoomRepositoryImplementation implements RoomRepository {

    public Integer save(RoomEntity roomEntity, Session session) {
        return (Integer) session.save(roomEntity);
    }

    public RoomEntity getByName(String name, Session session) throws Exception {
        return null;
    }

    ;
  public boolean doesNameExist(String name, Session session) throws Exception {
        return false;
    }

    ;
  public boolean isEmpty(Session session) {
        return false;
    }

    ;
  public List<RoomEntity> getAll(Session session) throws Exception {

        List<RoomEntity> roomEntities = session.createQuery("FROM RoomEntity").getResultList();

        for (RoomEntity roomEntity : roomEntities) {
            
            List<BookingDatesEntity> bookingDatesEntities = session.createQuery(
                    "FROM BookingDatesEntity WHERE roomID='" + roomEntity.getId() + "'").getResultList();
            roomEntity.setBookingDateEntities(bookingDatesEntities);
        }
        
        return roomEntities;

    }

    @Override
    public boolean update(RoomEntity e, Session session) throws Exception {

        throw new UnsupportedOperationException("Not supported yet.");

    }

    @Override
    public RoomEntity getByID(Integer id, Session session) throws Exception {
        return session.get(RoomEntity.class, id);
    }

}
