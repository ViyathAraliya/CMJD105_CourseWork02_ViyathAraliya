
package hms.service.custom;

import hms.dto.CustomerDto;
import hms.service.SuperService;
import java.util.List;


public interface CustomerService extends SuperService{
    List<CustomerDto> getAll() throws Exception;
    String update(CustomerDto dto) throws Exception;
}
