package hms.service.custom.implementation;

import hms.dto.CustomerDto;
import hms.entity.CustomerEntity;
import hms.repository.RepositoryFactory;
import hms.repository.custom.CustomerRepository;
import hms.service.custom.CustomerService;
import hms.util.SessionFactoryConfiguration;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CustomerServiceImplementation implements CustomerService {

    CustomerRepository customerRepository = (CustomerRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryType.CUSTOMER);
    Session session = SessionFactoryConfiguration.getInstance().getSession();

    @Override
    public List<CustomerDto> getAll() throws Exception {
        List<CustomerEntity> entities = customerRepository.getAll(session);
        List<CustomerDto> dtos = new ArrayList<>();
        for (CustomerEntity e : entities) {
            CustomerDto dto = new CustomerDto(e.getId(), e.getName(), e.getNic(), e.getPhoneNumber(), e.getEmail(), e.getAddress());
            dtos.add(dto);
        }
        return dtos;
    }

    @Override
    public String update(CustomerDto dto) throws Exception {
        Transaction transcation = session.beginTransaction();
        
        CustomerEntity e=new CustomerEntity(dto.getName(), dto.getNic(), dto.getPhoneNumber(),dto.getEmail(), dto.getAddress());
        if(customerRepository.update(e, session)){
            transcation.commit();
        return "succesfully updated";}else{
            transcation.rollback();
            return "failed to update";}
    }

}
