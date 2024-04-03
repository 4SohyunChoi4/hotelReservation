package hotelreservation.domain;

import hotelreservation.NotifyApplication;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Notify_table")
@Data
//<<< DDD / Aggregate Root
public class Notify {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public static NotifyRepository repository() {
        NotifyRepository notifyRepository = NotifyApplication.applicationContext.getBean(
            NotifyRepository.class
        );
        return notifyRepository;
    }

    //<<< Clean Arch / Port Method
    public static void notifyToUser(HotelReserved hotelReserved) {
        //implement business logic here:

        /** Example 1:  new item 
        Notify notify = new Notify();
        repository().save(notify);

        */

        /** Example 2:  finding and process
        
        repository().findById(hotelReserved.get???()).ifPresent(notify->{
            
            notify // do something
            repository().save(notify);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void notifyToUser(HotelCancelled hotelCancelled) {
        //implement business logic here:

        /** Example 1:  new item 
        Notify notify = new Notify();
        repository().save(notify);

        */

        /** Example 2:  finding and process
        
        repository().findById(hotelCancelled.get???()).ifPresent(notify->{
            
            notify // do something
            repository().save(notify);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
