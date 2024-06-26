package hotelreservation.domain;

import hotelreservation.CleanApplication;
import hotelreservation.domain.RoomCleanCancelled;
import hotelreservation.domain.RoomCleaned;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Clean_table")
@Data
//<<< DDD / Aggregate Root
public class Clean {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String roomId;

    @PostPersist
    public void onPostPersist() {
        RoomCleaned roomCleaned = new RoomCleaned(this);
        roomCleaned.publishAfterCommit();

        RoomCleanCancelled roomCleanCancelled = new RoomCleanCancelled(this);
        roomCleanCancelled.publishAfterCommit();
    }

    public static CleanRepository repository() {
        CleanRepository cleanRepository = CleanApplication.applicationContext.getBean(
            CleanRepository.class
        );
        return cleanRepository;
    }

    //<<< Clean Arch / Port Method
    public static void cleantheroom(HotelReserved hotelReserved) {
        //implement business logic here:

        /** Example 1:  new item 
        Clean clean = new Clean();
        repository().save(clean);

        RoomCleaned roomCleaned = new RoomCleaned(clean);
        roomCleaned.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(hotelReserved.get???()).ifPresent(clean->{
            
            clean // do something
            repository().save(clean);

            RoomCleaned roomCleaned = new RoomCleaned(clean);
            roomCleaned.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
