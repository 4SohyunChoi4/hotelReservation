package hotelreservation.domain;

import hotelreservation.domain.*;
import hotelreservation.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class PointUsed extends AbstractEvent {

    private Long id;
    private String userId;
    private Long point;

    public PointUsed(Point aggregate) {
        super(aggregate);
    }

    public PointUsed() {
        super();
    }
}
//>>> DDD / Domain Event
