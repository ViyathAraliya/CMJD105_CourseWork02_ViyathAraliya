
package hms.service;

import hms.service.custom.implementation.CatagoryServiceImplementation;
import hms.service.custom.implementation.UserServiceImplementation;

public class ServiceFactory {

    private static ServiceFactory serviceFactory;

    private ServiceFactory() {
    }

    public static ServiceFactory getInstance() {
        if (serviceFactory == null) {
            serviceFactory = new ServiceFactory();
        }
        return serviceFactory;
    }

    public SuperService getService(ServiceType type) {
        switch (type) {
            case USER:
                return new UserServiceImplementation();
            case CATAGORY:
                    return new CatagoryServiceImplementation();
            default:
                return null;
        }
    }

    public enum ServiceType {
        USER,CATAGORY
    }

}
