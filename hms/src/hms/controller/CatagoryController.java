package hms.controller;

import hms.dto.CatagoryDto;
import hms.service.ServiceFactory;
import hms.service.custom.CatagoryService;

import java.util.List;

public class CatagoryController {

    CatagoryService catagoryService = (CatagoryService) ServiceFactory.getInstance().
            getService(ServiceFactory.ServiceType.CATAGORY);

    public List<CatagoryDto> getAll() throws Exception {
        return catagoryService.getAll();
    }

    public CatagoryDto getById(Integer id) throws Exception {
        return catagoryService.getById(id);
    }

    public CatagoryDto getByName(String name) throws Exception {
        return catagoryService.getByName(name);
    }

    public String update(CatagoryDto dto) throws Exception{
        return catagoryService.update(dto);
    }
}
