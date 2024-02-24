

package hms.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Table(name="Booked_for_dates")
public class BookingDatesEntity {

     @EmbeddedId
     private BookingDatesEntityID bookingDateID;
}
