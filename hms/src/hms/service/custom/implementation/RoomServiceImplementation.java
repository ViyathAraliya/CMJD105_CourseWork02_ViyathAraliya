package hms.service.custom.implementation;

import hms.dto.CatagoryDto;
import hms.dto.BookingDatesDto;
import hms.dto.RoomDto;
import hms.entity.BookingDatesEntity;
import hms.entity.BookingDatesEntityID;
import hms.entity.CatagoryEntity;

import hms.entity.RoomEntity;
import hms.repository.RepositoryFactory;
import org.hibernate.Session;
import hms.repository.custom.RoomRepository;
import hms.service.custom.RoomService;
import hms.util.SessionFactoryConfiguration;
import java.util.ArrayList;
import java.util.List;

public class RoomServiceImplementation implements RoomService {

    Session session = SessionFactoryConfiguration.getInstance().getSession();
    RoomRepository roomRepository = (RoomRepository) RepositoryFactory.getInstance()
            .getRepository(RepositoryFactory.RepositoryType.ROOM);

    public String saveUser() throws Exception {

        return null;
    }

    public List<RoomDto> getAll() throws Exception {
        List<RoomEntity> roomEntities = roomRepository.getAll(session);
        List<RoomDto> roomDtos = new ArrayList<RoomDto>();
        for (RoomEntity e : roomEntities) {
            CatagoryEntity catagoryEntity = e.getCatagoryEntity();
            CatagoryDto catagoryDto = new CatagoryDto(catagoryEntity.getId(), catagoryEntity.getName(), catagoryEntity.getDescription(), catagoryEntity.getChargeForCatagory());
            List<BookingDatesDto> datesDtos = new ArrayList<>();

            List<BookingDatesEntity> bookingDateEntities = e.getBookingDateEntities();
            for (BookingDatesEntity bookingDatesEntity : bookingDateEntities) {
                BookingDatesEntityID bookingDatesEntityID = bookingDatesEntity.getBookingDateID();
                BookingDatesDto datesDto = new BookingDatesDto(bookingDatesEntityID.getCheck_in_Date(), bookingDatesEntityID.getCheck_out_Date());
                datesDtos.add(datesDto);
            }
            RoomDto roomDto = new RoomDto(e.getId(), catagoryDto, datesDtos, e.getStatus());
            roomDtos.add(roomDto);
        }
      
        return roomDtos;
    }

    public RoomDto getByID(Integer roomId) throws Exception {
        RoomEntity roomEntity = roomRepository.getByID(roomId, session);
        CatagoryEntity catagoryEntity = roomEntity.getCatagoryEntity();
        CatagoryDto catagoryDto = new CatagoryDto(roomId, catagoryEntity.getName(), catagoryEntity.getDescription(), catagoryEntity.getChargeForCatagory());
        List<BookingDatesDto> bookingDatesDtos = new ArrayList<>();
        List<BookingDatesEntity> bookingDatesEntities = roomEntity.getBookingDateEntities();
        for (BookingDatesEntity bookingDatesEntity : bookingDatesEntities) {
            BookingDatesEntityID bookingDatesEntityID = bookingDatesEntity.getBookingDateID();
            BookingDatesDto bookingDatesDto = new BookingDatesDto(bookingDatesEntityID.getCheck_in_Date(), bookingDatesEntityID.getCheck_out_Date());
            bookingDatesDtos.add(bookingDatesDto);
        }
        return new RoomDto(roomId, catagoryDto, bookingDatesDtos, roomEntity.getStatus());

    }

}
