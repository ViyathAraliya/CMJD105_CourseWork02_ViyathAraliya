

package hms.service.custom.implementation;


import hms.repository.RepositoryFactory;

import hms.repository.custom.RoomRepository;


public class RoomServiceImplementation{

    RoomRepository roomRepository = (RoomRepository) RepositoryFactory.getInstance()
            .getRepository(RepositoryFactory.RepositoryType.ROOM);
  public String saveUser()throws Exception {
       
       
        return null;
    }

}
