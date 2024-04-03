package hotelreservation.domain;

import hotelreservation.HotelRoomApplication;
import hotelreservation.domain.OutOfStock;
import hotelreservation.domain.RoomCntDecreased;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "HotelRoom_table")
@Data
//<<< DDD / Aggregate Root
public class HotelRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long roomQty;

    @PostPersist
    public void onPostPersist() {
        OutOfStock outOfStock = new OutOfStock(this);
        outOfStock.publishAfterCommit();

        RoomCntDecreased roomCntDecreased = new RoomCntDecreased(this);
        roomCntDecreased.publishAfterCommit();
    }

    public static HotelRoomRepository repository() {
        HotelRoomRepository hotelRoomRepository = HotelRoomApplication.applicationContext.getBean(
            HotelRoomRepository.class
        );
        return hotelRoomRepository;
    }

    //<<< Clean Arch / Port Method
    public static void decreaseRoomCnt(HotelReserved hotelReserved) {
        //implement business logic here:

        /** Example 1:  new item 
        HotelRoom hotelRoom = new HotelRoom();
        repository().save(hotelRoom);

        RoomCntDecreased roomCntDecreased = new RoomCntDecreased(hotelRoom);
        roomCntDecreased.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(hotelReserved.get???()).ifPresent(hotelRoom->{
            
            hotelRoom // do something
            repository().save(hotelRoom);

            RoomCntDecreased roomCntDecreased = new RoomCntDecreased(hotelRoom);
            roomCntDecreased.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void increaseRoomCnt(HotelCancelled hotelCancelled) {
        //implement business logic here:

        /** Example 1:  new item 
        HotelRoom hotelRoom = new HotelRoom();
        repository().save(hotelRoom);

        */

        /** Example 2:  finding and process
        
        repository().findById(hotelCancelled.get???()).ifPresent(hotelRoom->{
            
            hotelRoom // do something
            repository().save(hotelRoom);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
