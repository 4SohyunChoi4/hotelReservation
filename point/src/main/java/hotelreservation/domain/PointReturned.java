package hotelreservation.domain;

import hotelreservation.domain.*;
import hotelreservation.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class PointReturned extends AbstractEvent {

    private Long id;
    private String userId;
    private Long point;

    public PointReturned(Point aggregate) {
        super(aggregate);
    }

    public PointReturned() {
        super();
    }
}
//>>> DDD / Domain Event
