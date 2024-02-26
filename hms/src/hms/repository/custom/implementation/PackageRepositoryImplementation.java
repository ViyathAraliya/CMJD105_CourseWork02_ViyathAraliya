package hms.repository.custom.implementation;

import hms.entity.PackageEntity;

import hms.repository.custom.PackageRepository;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class PackageRepositoryImplementation implements PackageRepository {

    @Override
    public Integer save(PackageEntity e, Session session) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public PackageEntity getByName(String description, Session session) throws Exception {
        String hql = "FROM PackageEntity WHERE description='" + description + "'";
        List list = session.createQuery(hql).getResultList();
        PackageEntity packageEntity = (PackageEntity) list.get(0);
        return packageEntity;
    }

    @Override
    public boolean doesNameExist(String name, Session session) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isEmpty(Session session) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<PackageEntity> getAll(Session session) throws Exception {

        return session.createQuery("from PackageEntity").getResultList();

    }

    @Override
    public boolean update(PackageEntity e, Session session) throws Exception {
        Transaction transaction = session.beginTransaction();
        if (session.merge(e) == null) {
            transaction.rollback();
            return false;
        }
        transaction.commit();
        return true;

    }

    @Override
    public PackageEntity getByID(Integer id, Session session) throws Exception {
        return session.get(PackageEntity.class, id);
    }

    @Override
    public Integer deleteByID(Integer id, Session session) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
