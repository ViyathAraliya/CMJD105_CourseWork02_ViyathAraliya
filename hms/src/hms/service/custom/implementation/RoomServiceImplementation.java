

package hms.service.custom.implementation;


import hms.dto.RoomDto;

import hms.entity.RoomEntity;
import hms.repository.RepositoryFactory;

import hms.repository.custom.RoomRepository;
import hms.service.custom.RoomService;
import java.util.ArrayList;
import java.util.List;


public class RoomServiceImplementation implements  RoomService{

    RoomRepository roomRepository = (RoomRepository) RepositoryFactory.getInstance()
            .getRepository(RepositoryFactory.RepositoryType.ROOM);
  public String saveUser()throws Exception {
       
       
        return null;
    }
  
  public List<RoomDto> getAll() throws Exception{
    List<RoomEntity> roomEntities=roomRepository.getAll();
    List<RoomDto> roomDtos=new ArrayList<RoomDto>();
    for(RoomEntity e:roomEntities){
        roomDtos.add(new RoomDto(e.getId(),e.getBookedFrom(), e.getBookedTill(), e.getCatagoryEntity().getId()));}
    return roomDtos;
  }

}
