
package hms.controller;

import hms.dto.CatagoryDto;
import hms.service.ServiceFactory;
import hms.service.custom.CatagoryService;

import java.util.List;


public class CatagoryController {
    CatagoryService catagoryService=(CatagoryService)ServiceFactory.getInstance().
            getService(ServiceFactory.ServiceType.CATAGORY);
    
    public List<CatagoryDto> getAll()throws Exception{
        return catagoryService.getAll();}
}