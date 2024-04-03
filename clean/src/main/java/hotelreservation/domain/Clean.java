package hotelreservation.domain;

import hotelreservation.CleanApplication;
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

    private String cleanStatus;

    private Long reserveId;

    private Long customerId;

    @PostPersist
    public void onPostPersist() {
        RoomCleaned roomCleaned = new RoomCleaned(this);
        roomCleaned.publishAfterCommit();
    }

    public static CleanRepository repository() {
        CleanRepository cleanRepository = CleanApplication.applicationContext.getBean(
            CleanRepository.class
        );
        return cleanRepository;
    }

    //<<< Clean Arch / Port Method
    public static void cleanTheRoom(HotelReserved hotelReserved) {
        //implement business logic here:

        /** Example 1:  new item 
        Clean clean = new Clean();
        repository().save(clean);

        */

        /** Example 2:  finding and process
        
        repository().findById(hotelReserved.get???()).ifPresent(clean->{
            
            clean // do something
            repository().save(clean);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
