
package hms.repository.custom;

import hms.entity.PackageEntity;
import hms.repository.CrudRepository;
import java.util.List;

public interface PackageRepository extends CrudRepository<PackageEntity, Integer>{
    List<PackageEntity> packageEntitiesById(Integer id)throw Exception;
}
