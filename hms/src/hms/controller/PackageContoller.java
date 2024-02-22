
package hms.controller;

import hms.dto.PackageDto;

import hms.service.ServiceFactory;
import hms.service.custom.PackageService;
import java.util.List;



public class PackageContoller {
    PackageService packageService=(PackageService)ServiceFactory.getInstance()
            .getService(ServiceFactory.ServiceType.PACKAGE);
    
    public List<PackageDto> getAll() throws Exception{
        return packageService.getAll(); }
    
    public PackageDto  getByDescription(String description) throws Exception{
        return packageService.getByDescription(description);
    }

}
