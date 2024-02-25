
package hms;
import hms.entity.CustomerEntity;
import org.hibernate.Session;

import hms.repository.RepositoryFactory;
import hms.repository.custom.CustomerRepository;
import hms.util.SessionFactoryConfiguration;
import hms.view.CancelReservationView;
import hms.view.LoginView;
import hms.view.MakeReservationView;

import org.hibernate.Transaction;



public class Hms {

    
    public static void main(String[] args) {
    //SessionFactoryConfiguration.getSessionFactoryConfiguration().getSession();
    //new LoginView().setVisible(true);
   new MakeReservationView().setVisible(true);
  // new CancelReservationView().setVisible(true);
  
    
 
}}
