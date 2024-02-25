
package hms.repository;


import java.util.List;
import org.hibernate.Session;


public interface CrudRepository<Entity,ID> extends SuperRepository{
  ID save(Entity e,Session session)throws Exception;
  Entity getByID(ID id,Session session) throws Exception;
  Entity getByName(String name,Session session)throws Exception;
  boolean doesNameExist(String name,Session session) throws Exception;
  boolean isEmpty(Session session);
  List<Entity> getAll(Session session) throws Exception;
  boolean update(Entity e,Session session) throws Exception;
  Integer deleteByID(ID id,Session session) throws Exception;
    
}
