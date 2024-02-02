/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hms.dao;

/**
 *
 * @author viyat
 */
public interface CrudDao<Entity,ID> extends SuperDao {
    String save(Entity entity)throws Exception;
    
}
