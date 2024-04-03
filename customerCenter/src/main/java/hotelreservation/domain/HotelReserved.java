package hotelreservation.domain;

import hotelreservation.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class HotelReserved extends AbstractEvent {

    private Long id;
    private String roomType;
    private String status;
    private Long roomId;
}
