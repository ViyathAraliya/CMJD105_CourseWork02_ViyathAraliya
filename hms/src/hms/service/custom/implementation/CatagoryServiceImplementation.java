package hms.service.custom.implementation;

import hms.dto.CatagoryDto;
import hms.entity.CatagoryEntity;
import hms.repository.RepositoryFactory;
import hms.repository.custom.CatagoryRepository;

import hms.service.custom.CatagoryService;
import hms.util.SessionFactoryConfiguration;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

public class CatagoryServiceImplementation implements CatagoryService {
    Session session=SessionFactoryConfiguration.getInstance().getSession();
    CatagoryRepository catagoryRepository = (CatagoryRepository) RepositoryFactory.getInstance()
            .getRepository(RepositoryFactory.RepositoryType.CATAGORY);

    public List<CatagoryDto> getAll() throws Exception {
        List<CatagoryEntity> catagoryEntities = catagoryRepository.getAll(session);
        List<CatagoryDto> catagoryDtos=new ArrayList<>();
        for (CatagoryEntity e : catagoryEntities) {
            catagoryDtos.add(new CatagoryDto(e.getId(), e.getName(), e.getDescription(),
                     e.getChargeForCatagory()));
        }
        return catagoryDtos;
    }
   
    public CatagoryDto getById(Integer id) throws Exception{
       CatagoryEntity catagoryEntity=catagoryRepository.getByID(id,session);
       return new CatagoryDto(catagoryEntity.getId(), catagoryEntity.getName(), 
               catagoryEntity.getDescription(), catagoryEntity.getChargeForCatagory());
    }
    public CatagoryDto getByName(String name) throws Exception{
        CatagoryEntity e=catagoryRepository.getByName(name,session);
        return new CatagoryDto(e.getId(), e.getName(),e.getDescription(),e.getChargeForCatagory());
    }

}
