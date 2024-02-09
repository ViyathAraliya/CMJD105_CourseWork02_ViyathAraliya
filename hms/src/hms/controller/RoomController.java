

package hms.controller;

import hms.entity.RoomEntity;
import hms.repository.RepositoryFactory;
import hms.repository.custom.RoomRepository;

public class RoomController {
    RoomRepository r=(RoomRepository)RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryType.ROOM);
    public String saveRoom(RoomEntity e)throws Exception{
        return r.save(e);
    }
}
