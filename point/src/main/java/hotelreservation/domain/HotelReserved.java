package hotelreservation.domain;

import hotelreservation.domain.*;
import hotelreservation.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class HotelReserved extends AbstractEvent {

    private Long id;
    private String roomType;
    private String status;
    private String userId;
}
