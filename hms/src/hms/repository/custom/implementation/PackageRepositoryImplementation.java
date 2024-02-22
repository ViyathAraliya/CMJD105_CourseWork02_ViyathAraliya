
package hms.repository.custom.implementation;

import hms.entity.PackageEntity;
import hms.entity.UserEntity;
import hms.repository.custom.PackageRepository;
import hms.util.SessionFactoryConfiguration;
import java.util.List;
import org.hibernate.Session;


public class PackageRepositoryImplementation implements PackageRepository{
    
    Session session=SessionFactoryConfiguration.getInstance().getSession();

    @Override
    public Integer save(PackageEntity e) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public PackageEntity getByName(String description) throws Exception {
         String hql = "FROM PackageEntity WHERE description='" + description + "'";
            List list = session.createQuery(hql).getResultList();
           PackageEntity packageEntity = (PackageEntity) list.get(0);
            return  packageEntity;
    }

    @Override
    public boolean doesNameExist(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    @Override
    public List<PackageEntity> getAll() throws Exception {
     
       return session.createQuery("from PackageEntity").getResultList();
         
       
    }

    @Override
    public boolean update(PackageEntity e) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public PackageEntity getByID(Integer id) throws Exception {
       return session.get(PackageEntity.class, id);
    }
    
   
    
    

}
