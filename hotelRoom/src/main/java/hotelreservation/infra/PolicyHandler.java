package hotelreservation.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import hotelreservation.config.kafka.KafkaProcessor;
import hotelreservation.domain.*;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    HotelRoomRepository hotelRoomRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='HotelReserved'"
    )
    public void wheneverHotelReserved_DecreaseRoomCnt(
        @Payload HotelReserved hotelReserved
    ) {
        HotelReserved event = hotelReserved;
        System.out.println(
            "\n\n##### listener DecreaseRoomCnt : " + hotelReserved + "\n\n"
        );

        // Sample Logic //
        HotelRoom.decreaseRoomCnt(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='HotelCancelled'"
    )
    public void wheneverHotelCancelled_IncreaseRoomCnt(
        @Payload HotelCancelled hotelCancelled
    ) {
        HotelCancelled event = hotelCancelled;
        System.out.println(
            "\n\n##### listener IncreaseRoomCnt : " + hotelCancelled + "\n\n"
        );

        // Sample Logic //
        HotelRoom.increaseRoomCnt(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
