package hotelreservation.infra;

import hotelreservation.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class HotelRoomHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<HotelRoom>> {

    @Override
    public EntityModel<HotelRoom> process(EntityModel<HotelRoom> model) {
        return model;
    }
}
