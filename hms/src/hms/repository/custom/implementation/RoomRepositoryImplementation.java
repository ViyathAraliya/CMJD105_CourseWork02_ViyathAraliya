package hms.repository.custom.implementation;

import hms.entity.RoomEntity;
import hms.repository.custom.RoomRepository;
import hms.util.SessionFactoryConfiguration;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class RoomRepositoryImplementation implements RoomRepository {

    Session session = SessionFactoryConfiguration.getInstance().getSession();

    public Integer save(RoomEntity roomEntity) {
        return (Integer)session.save(roomEntity);
    }

    public RoomEntity getByName(Integer name) throws Exception {
        return null;
    }

    ;
  public boolean doesNameExist(Integer name) throws Exception {
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

    @Override
    public boolean update(RoomEntity e) throws Exception {
        Date check_in_date=e.getCheck_in_date();
        Date check_out_date=e.getCheck_out_date();
        
        session.update(e);
        RoomEntity entityFromTable=session.get(RoomEntity.class, e.getId());
        return check_in_date.equals(entityFromTable.getCheck_in_date())
                   && check_out_date.equals(entityFromTable.getCheck_out_date());
        
    
    }

}
