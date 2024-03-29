package hms.service.custom.implementation;

import hms.dto.PackageDto;
import hms.entity.PackageEntity;
import hms.entity.ReservationDetailEntity;
import hms.repository.RepositoryFactory;
import hms.repository.custom.PackageRepository;
import hms.repository.custom.ReservationDetailRepository;
import hms.repository.custom.ReservationRepository;
import hms.service.custom.PackageService;
import hms.util.SessionFactoryConfiguration;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

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
        PackageEntity e = packageRepository.getByName(description, session);
        return new PackageDto(e.getId(), e.getDescription(), e.getCharge());
    }

    public String update(PackageDto dto) throws Exception {
        ReservationDetailRepository reservationDetailRepository = (ReservationDetailRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryType.RESERVATION_DETAIL);
        PackageEntity pkgE = new PackageEntity(dto.getPackageID(), dto.getDescription(), dto.getCharge_for_package());

        if (packageRepository.update(pkgE, session) == false) {
            return "error in updating package";
        }

        return "update succesful";

    }

    public String save(PackageDto dto) throws Exception {
        Transaction transcation = session.beginTransaction();
        PackageEntity packageEntity = new PackageEntity();
        packageEntity.setDescription(dto.getDescription());
        packageEntity.setCharge(dto.getCharge_for_package());
        Integer id = packageRepository.save(packageEntity, session);
        if (id == null || id == -1) {
            transcation.rollback();
            return "error in savin package";
        }
        transcation.commit();
        return "succesfully saved";
    }

}
