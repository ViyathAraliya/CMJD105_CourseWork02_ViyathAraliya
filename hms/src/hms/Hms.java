
package hms;


import hms.repository.RepositoryFactory;
import hms.service.util.SessionFactoryConfiguration;
import hms.view.LoginView;
import hms.view.MakeReservationView;


public class Hms {

    
    public static void main(String[] args) {
    //SessionFactoryConfiguration.getSessionFactoryConfiguration().getSession();
    new LoginView().setVisible(true);
}}
