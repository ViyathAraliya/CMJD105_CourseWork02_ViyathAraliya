
package hms.repository;


import hms.repository.custom.implementation.CatagoryRepositoryImplementation;
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
            default:
                return null;
        }
    }

    public enum RepositoryType {
        USER,ROOM,CATAGORY
    }

}
