

package hms.service.custom.implementation;


import hms.dto.CatagoryDto;
import hms.dto.RoomDto;
import hms.entity.CatagoryEntity;

import hms.entity.RoomEntity;
import hms.repository.RepositoryFactory;
import org.hibernate.Session;
import hms.repository.custom.RoomRepository;
import hms.service.custom.RoomService;
import hms.util.SessionFactoryConfiguration;
import java.util.ArrayList;
import java.util.List;


public class RoomServiceImplementation implements  RoomService{
Session session=SessionFactoryConfiguration.getInstance().getSession();
    RoomRepository roomRepository = (RoomRepository) RepositoryFactory.getInstance()
            .getRepository(RepositoryFactory.RepositoryType.ROOM);
  public String saveUser()throws Exception {
       
       
        return null;
    }
  
  public List<RoomDto> getAll() throws Exception{
    List<RoomEntity> roomEntities=roomRepository.getAll(session);
    List<RoomDto> roomDtos=new ArrayList<RoomDto>();
    for(RoomEntity e:roomEntities){
        CatagoryEntity catagoryEntity=e.getCatagoryEntity();
        CatagoryDto catagoryDto=new CatagoryDto(catagoryEntity.getId(), catagoryEntity.getName(),catagoryEntity.getDescription(),catagoryEntity.getChargeForCatagory());
        roomDtos.add(new RoomDto(e.getId(),e.getCheck_in_date(), e.getCheck_out_date(),  catagoryDto));}
    return roomDtos;
  }

}
