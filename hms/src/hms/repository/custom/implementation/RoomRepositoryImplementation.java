package hms.repository.custom.implementation;

import hms.entity.RoomEntity;
import hms.repository.custom.RoomRepository;
import hms.service.util.SessionFactoryConfiguration;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class RoomRepositoryImplementation implements RoomRepository {

    Session session = SessionFactoryConfiguration.getInstance().getSession();

    public String save(RoomEntity roomEntity) {
        Transaction transaction = session.beginTransaction();
        try {
            Integer id = (Integer) session.save(roomEntity);
            transaction.commit();

            return id.toString();
        } catch (Exception e) {
            transaction.rollback();
            return e.getMessage();
        }
    }

    public RoomEntity getByName(String name) throws Exception {
        return null;
    }

    ;
  public boolean doesNameExist(String name) throws Exception {
        return false;
    }

    ;
  public boolean isEmpty() {
        return false;
    }

    ;
  public List<RoomEntity> getAll() throws Exception {
        List<RoomEntity> roomEntities = session.createQuery("from RoomEntity").getResultList();
        return roomEntities;
    }

}
