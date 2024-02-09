/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hms.controller;

import hms.dto.CatagoryDto;
import hms.service.ServiceFactory;
import hms.service.custom.CatagoryService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author viyat
 */
public class CatagoryController {
    CatagoryService catagoryService=(CatagoryService)ServiceFactory.getInstance().
            getService(ServiceFactory.ServiceType.CATAGORY);
    
    public List<CatagoryDto> getAll()throws Exception{
        return catagoryService.getAll();}
}
