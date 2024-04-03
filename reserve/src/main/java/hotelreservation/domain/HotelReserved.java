package hotelreservation.domain;

import hotelreservation.domain.*;
import hotelreservation.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class HotelReserved extends AbstractEvent {

    private Long id;
    private String roomId;
    private Long roomQty;

    public HotelReserved(Reserve aggregate) {
        super(aggregate);
    }

    public HotelReserved() {
        super();
    }
}
//>>> DDD / Domain Event
