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
import org.hibernate.Transaction;

public class CatagoryServiceImplementation implements CatagoryService {

    Session session = SessionFactoryConfiguration.getInstance().getSession();
    CatagoryRepository catagoryRepository = (CatagoryRepository) RepositoryFactory.getInstance()
            .getRepository(RepositoryFactory.RepositoryType.CATAGORY);

    public List<CatagoryDto> getAll() throws Exception {
        List<CatagoryEntity> catagoryEntities = catagoryRepository.getAll(session);
        List<CatagoryDto> catagoryDtos = new ArrayList<>();
        for (CatagoryEntity e : catagoryEntities) {
            catagoryDtos.add(new CatagoryDto(e.getId(), e.getName(), e.getDescription(),
                    e.getChargeForCatagory()));
        }
        return catagoryDtos;
    }

    public CatagoryDto getById(Integer id) throws Exception {
        CatagoryEntity catagoryEntity = catagoryRepository.getByID(id, session);
        return new CatagoryDto(catagoryEntity.getId(), catagoryEntity.getName(),
                catagoryEntity.getDescription(), catagoryEntity.getChargeForCatagory());
    }

    public CatagoryDto getByName(String name) throws Exception {
        CatagoryEntity e = catagoryRepository.getByName(name, session);

        return new CatagoryDto(e.getId(), e.getName(), e.getDescription(), e.getChargeForCatagory());
    }

    public String update(CatagoryDto dto) throws Exception {

        CatagoryEntity e = new CatagoryEntity(dto.getId(), dto.getCatagoryName(), dto.getDescription(), dto.getChargeForCatagory());
        Transaction transaction=session.beginTransaction();
        if (catagoryRepository.update(e, session)) {
            transaction.commit();
            return "succesfully updated";
        }
         transaction.rollback();
        return "error in updating";
        
    }

}
