
package hms.repository;


import java.util.List;


public interface CrudRepository<Entity,ID> extends SuperRepository{
  ID save(Entity e)throws Exception;
  Entity getByID(ID id) throws Exception;
  Entity getByName(String name)throws Exception;
  boolean doesNameExist(String name) throws Exception;
  boolean isEmpty();
  List<Entity> getAll() throws Exception;
  boolean update(Entity e) throws Exception;
    
}
