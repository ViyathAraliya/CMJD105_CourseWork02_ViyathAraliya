package hms.controller;

import hms.dto.RoomDto;
import hms.service.ServiceFactory;
import hms.service.custom.RoomService;
import java.util.List;

public class RoomController {

    RoomService roomService = (RoomService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ROOM);

    public List<RoomDto> getAll() throws Exception {
        return roomService.getAll();
    }
    public RoomDto getById(Integer roomID) throws Exception{
     return    roomService.getByID(roomID);
    }

}
