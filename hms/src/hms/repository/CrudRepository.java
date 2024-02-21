
package hms.repository;


import java.util.List;


public interface CrudRepository<Entity,ID> extends SuperRepository{
  ID save(Entity e)throws Exception;
  Entity getByName(ID name)throws Exception;
  boolean doesNameExist(ID name) throws Exception;
  boolean isEmpty();
  List<Entity> getAll() throws Exception;
  boolean update(Entity e) throws Exception;
    
}
