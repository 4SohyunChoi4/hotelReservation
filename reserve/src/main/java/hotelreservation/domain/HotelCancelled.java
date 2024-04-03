package hotelreservation.domain;

import hotelreservation.domain.*;
import hotelreservation.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class HotelCancelled extends AbstractEvent {

    private Long id;
    private String roomId;
    private Long roomQty;

    public HotelCancelled(Reserve aggregate) {
        super(aggregate);
    }

    public HotelCancelled() {
        super();
    }
}
//>>> DDD / Domain Event
