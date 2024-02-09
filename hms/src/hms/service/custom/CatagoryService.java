/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hms.service.custom;

import hms.dto.CatagoryDto;
import hms.service.SuperService;
import java.util.ArrayList;
import java.util.List;


public interface CatagoryService extends SuperService{
  public List<CatagoryDto> getAll() throws Exception;
}
