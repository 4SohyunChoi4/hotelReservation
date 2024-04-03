package hotelreservation.domain;

import hotelreservation.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class RoomCleaned extends AbstractEvent {

    private Long id;
    private String cleanStatus;
    private Long customerId;
    private Long reserveId;
}
