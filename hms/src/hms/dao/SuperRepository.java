/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hms.dao;

/**
 *
 * @author viyat
 */
public interface SuperRepository<Entity,ID> {
    Integer save(Entity e)throws Exception;
    Entity getByName(ID name)throws Exception;
    
}
