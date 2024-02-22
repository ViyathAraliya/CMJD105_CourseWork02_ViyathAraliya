
package hms.repository;


import hms.repository.custom.implementation.CatagoryRepositoryImplementation;
import hms.repository.custom.implementation.CustomerRepositoryImplementation;
import hms.repository.custom.implementation.PackageRepositoryImplementation;
import hms.repository.custom.implementation.ReservationDetailRepositoryImplementation;
import hms.repository.custom.implementation.ReservationRepositoryImplementation;
import hms.repository.custom.implementation.RoomRepositoryImplementation;
import hms.repository.custom.implementation.UserRepositoryImplementation;


public class RepositoryFactory {

    private static RepositoryFactory repositoryFactory;

    public static RepositoryFactory getInstance() {
        if (repositoryFactory == null) {
            repositoryFactory = new RepositoryFactory();
        }
        return repositoryFactory;
    }

    public SuperRepository getRepository(RepositoryType type) {
        switch (type) {
            case USER:
                return new UserRepositoryImplementation();
           
            case ROOM:
                    return new RoomRepositoryImplementation();
            case CATAGORY:
                return new CatagoryRepositoryImplementation();
            case PACKAGE:
                return new PackageRepositoryImplementation();
            case RESERVATION:
                return new ReservationRepositoryImplementation();
            case CUSTOMER:
                return new CustomerRepositoryImplementation();
            case RESERVATION_DETAIL:
                return new ReservationDetailRepositoryImplementation();
            default:
                return null;
        }
    }

    public enum RepositoryType {
        USER,ROOM,CATAGORY,PACKAGE,RESERVATION,CUSTOMER,RESERVATION_DETAIL
    }

}
