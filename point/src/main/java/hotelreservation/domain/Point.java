package hotelreservation.domain;

import hotelreservation.PointApplication;
import hotelreservation.domain.PointGained;
import hotelreservation.domain.PointReturned;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Point_table")
@Data
//<<< DDD / Aggregate Root
public class Point {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userId;

    private Long point;

    @PostPersist
    public void onPostPersist() {
        PointGained pointGained = new PointGained(this);
        pointGained.publishAfterCommit();

        PointReturned pointReturned = new PointReturned(this);
        pointReturned.publishAfterCommit();
    }

    public static PointRepository repository() {
        PointRepository pointRepository = PointApplication.applicationContext.getBean(
            PointRepository.class
        );
        return pointRepository;
    }

    //<<< Clean Arch / Port Method
    public static void gainPoint(HotelReserved hotelReserved) {
        //implement business logic here:

        /** Example 1:  new item 
        Point point = new Point();
        repository().save(point);

        PointGained pointGained = new PointGained(point);
        pointGained.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(hotelReserved.get???()).ifPresent(point->{
            
            point // do something
            repository().save(point);

            PointGained pointGained = new PointGained(point);
            pointGained.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void returnPoint(HotelCancelled hotelCancelled) {
        //implement business logic here:

        /** Example 1:  new item 
        Point point = new Point();
        repository().save(point);

        PointReturned pointReturned = new PointReturned(point);
        pointReturned.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(hotelCancelled.get???()).ifPresent(point->{
            
            point // do something
            repository().save(point);

            PointReturned pointReturned = new PointReturned(point);
            pointReturned.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
