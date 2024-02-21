
package hms;


import hms.repository.RepositoryFactory;
import hms.util.SessionFactoryConfiguration;
import hms.view.LoginView;
import hms.view.MakeReservationView;



public class Hms {

    
    public static void main(String[] args) {
    //SessionFactoryConfiguration.getSessionFactoryConfiguration().getSession();
    //new LoginView().setVisible(true);
    new MakeReservationView().setVisible(true);
    //new LoginView().setVisible(true);
}}
