
package hms.repository.custom.implementation;

import hms.entity.CatagoryEntity;
import hms.repository.custom.CatagoryRepository;
import hms.service.util.SessionFactoryConfiguration;
import org.hibernate.Session;
import java.util.List;

public class CatagoryRepositoryImplementation 
        implements CatagoryRepository
{
    
  
   Session session=SessionFactoryConfiguration.getInstance().getSession();
    public String save(CatagoryEntity e) throws Exception {
        return "method not created yet";
    }

  
    public CatagoryEntity getByName(Integer name) throws Exception {
      return  session.get(CatagoryEntity.class, name);
    }

    public boolean doesNameExist(Integer name) throws Exception {
      return false;
    }


    public boolean isEmpty() {
     return false;
    }

    public List<CatagoryEntity> getAll() throws Exception {
        List<CatagoryEntity> catagoryEntities=session.createQuery("from CatagoryEntity").getResultList();
               return catagoryEntities;
    }
   
}
