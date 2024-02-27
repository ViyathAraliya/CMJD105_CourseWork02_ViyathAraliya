
package hms.controller;

import hms.dto.CustomerDto;
import hms.service.ServiceFactory;
import hms.service.custom.CustomerService;
import java.util.List;


public class CustomerController {

    private CustomerService customerService=(CustomerService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CUSTOMER);
    
    public List<CustomerDto> getAll() throws Exception{
        return customerService.getAll();
    }
    
    public String save(CustomerDto dto) throws Exception{
        return customerService.update(dto);
    }
    public String update(CustomerDto dto) throws Exception{
        return customerService.update(dto);
    }
}
