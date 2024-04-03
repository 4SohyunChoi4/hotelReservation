package hotelreservation.domain;

import hotelreservation.domain.*;
import hotelreservation.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class RoomCntDecreased extends AbstractEvent {

    private Long id;

    public RoomCntDecreased(HotelRoom aggregate) {
        super(aggregate);
    }

    public RoomCntDecreased() {
        super();
    }
}
//>>> DDD / Domain Event
