
package hms.repository.custom;

import hms.entity.BookingDatesEntity;
import hms.entity.BookingDatesEntityID;
import hms.repository.CrudRepository;
import org.hibernate.Session;


public interface BookingDateRepository extends  CrudRepository<BookingDatesEntity, Integer>{
    BookingDatesEntityID saveBooking(BookingDatesEntity bookingDatesEntity,Session session)throws Exception;
    
}
