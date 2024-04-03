package hotelreservation.domain;

import hotelreservation.domain.*;
import hotelreservation.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class RoomCleanCancelled extends AbstractEvent {

    private Long id;

    public RoomCleanCancelled(Clean aggregate) {
        super(aggregate);
    }

    public RoomCleanCancelled() {
        super();
    }
}
//>>> DDD / Domain Event
