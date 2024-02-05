/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hms.repository;

/**
 *
 * @author viyat
 */
public interface CrudRepository<Entity,ID> extends SuperRepository{
  String save(Entity e)throws Exception;
  Entity getByName(ID name)throws Exception;
  boolean doesNameExist(String name) throws Exception;
  boolean isEmpty();
    
}
