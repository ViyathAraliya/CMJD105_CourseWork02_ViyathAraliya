
package hms.repository.custom.implementation;

import hms.entity.PackageEntity;
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
    public PackageEntity getByName(Integer name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean doesNameExist(Integer name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    @Override
    public List<PackageEntity> getAll() throws Exception {
        System.out.println("here j");
       return session.createQuery("from PackageEntity").getResultList();
         
       
    }

}
