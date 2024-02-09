package hms.util;

import hms.util.custom.implementation.CatagorySessionFacCofigImpl;
import hms.util.custom.implementation.UserSessionFacConfigImpl;

public class SessionFactoryConfigurationFactory {

    private static SessionFactoryConfigurationFactory sessionFactoryConfigurationFactory;
    
    private static CatagorySessionFacCofigImpl catagorySessionFacCofigImpl;
    private static UserSessionFacConfigImpl userSessionFacConfigImpl;

    public static SessionFactoryConfigurationFactory getInstance() {
        if (sessionFactoryConfigurationFactory == null) {
            sessionFactoryConfigurationFactory = new SessionFactoryConfigurationFactory();
        }
        return sessionFactoryConfigurationFactory;
    }

    public SuperSessionFactory getSessionFactoryInstance(SessionType type) {
        switch (type) {
            case USER:
                if (userSessionFacConfigImpl == null) {
                    userSessionFacConfigImpl = new UserSessionFacConfigImpl();
                }
                return userSessionFacConfigImpl;
            case CATAGORY:
                if (catagorySessionFacCofigImpl == null) {
                    catagorySessionFacCofigImpl = new CatagorySessionFacCofigImpl();
                }
                return catagorySessionFacCofigImpl;
            default:
                return null;
        }

    }

    public enum SessionType {
        USER, CATAGORY
    }
}
