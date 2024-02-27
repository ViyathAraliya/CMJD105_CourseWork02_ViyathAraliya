package hms.repository.custom.implementation;

import hms.entity.CatagoryEntity;

import hms.repository.custom.CatagoryRepository;

import org.hibernate.Session;
import java.util.List;

public class CatagoryRepositoryImplementation implements CatagoryRepository {

    public Integer save(CatagoryEntity e, Session session) throws Exception {
       return (Integer)session.save(e);
    }

    public boolean doesNameExist(String name, Session session) throws Exception {
        return false;
    }

    public boolean isEmpty(Session session) {
        return false;
    }

    public List<CatagoryEntity> getAll(Session session) throws Exception {
        List<CatagoryEntity> catagoryEntities = session.createQuery("from CatagoryEntity").getResultList();
        return catagoryEntities;
    }

    @Override
    public boolean update(CatagoryEntity e, Session session) throws Exception {
        if (session.merge(e) == null) {
            return false;
        }
        return true;
    }

    @Override
    public CatagoryEntity getByID(Integer id, Session session) throws Exception {
        return session.get(CatagoryEntity.class, id);
    }

    @Override
    public CatagoryEntity getByName(String name, Session session) throws Exception {
        String hql = "FROM CatagoryEntity WHERE catagoryName='" + name + "'";
        List list = session.createQuery(hql).getResultList();
        CatagoryEntity catagoryEntity = (CatagoryEntity) list.get(0);
        return catagoryEntity;
    }

    @Override
    public Integer deleteByID(Integer id, Session session) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
