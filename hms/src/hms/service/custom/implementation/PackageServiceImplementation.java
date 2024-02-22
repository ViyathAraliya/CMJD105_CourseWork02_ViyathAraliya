
package hms.service.custom.implementation;


import hms.dto.PackageDto;
import hms.entity.PackageEntity;
import hms.repository.RepositoryFactory;
import hms.repository.custom.PackageRepository;
import hms.service.custom.PackageService;
import java.util.ArrayList;
import java.util.List;

public class PackageServiceImplementation implements PackageService{
    
    PackageRepository packageRepository=(PackageRepository) RepositoryFactory.getInstance()
            .getRepository(RepositoryFactory.RepositoryType.PACKAGE);
    
    public List<PackageDto> getAll() throws Exception{
        List<PackageEntity> packageEntities=packageRepository.getAll();
        List<PackageDto> packageDtos=new ArrayList<>();
        for(PackageEntity e: packageEntities){
            packageDtos.add(new PackageDto(e.getId(),e.getDescription(),e.getCharge()));}
        return packageDtos;
        
    }

    @Override
    public PackageDto getByDescription(String description) throws Exception {
      
           PackageEntity e= packageRepository.getByName(description);
           return  new PackageDto(e.getId(), e.getDescription(), e.getCharge());
    }

}
