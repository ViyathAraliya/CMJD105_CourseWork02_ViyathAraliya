package hms.service.custom.implementation;

import hms.dto.PackageDto;
import hms.entity.PackageEntity;
import hms.repository.RepositoryFactory;
import hms.repository.custom.PackageRepository;
import hms.service.custom.PackageService;
import hms.util.SessionFactoryConfiguration;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

public class PackageServiceImplementation implements PackageService {

    Session session = SessionFactoryConfiguration.getInstance().getSession();
    PackageRepository packageRepository = (PackageRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryType.PACKAGE);

    public List<PackageDto> getAll() throws Exception {
        List<PackageEntity> packageEntities = packageRepository.getAll(session);
        List<PackageDto> packageDtos = new ArrayList<>();
        for (PackageEntity e : packageEntities) {
            packageDtos.add(new PackageDto(e.getId(), e.getDescription(), e.getCharge()));
        }
        return packageDtos;

    }

    @Override
    public PackageDto getByDescription(String description) throws Exception {

        PackageEntity e = packageRepository.getByName(description,session);
        return new PackageDto(e.getId(), e.getDescription(), e.getCharge());
    }
    
    public String update(PackageDto dto)throws Exception{
        PackageEntity pkgE=new PackageEntity(dto.getPackageID(), dto.getDescription(), dto.getCharge_for_package());
        boolean =packageRepository.update(pkgE, session);
        
        }

}
