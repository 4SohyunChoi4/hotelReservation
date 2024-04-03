package hotelreservation.domain;

import hotelreservation.PointApplication;
import hotelreservation.domain.PointUsed;
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

    private Long point;

    @PostPersist
    public void onPostPersist() {
        PointUsed pointUsed = new PointUsed(this);
        pointUsed.publishAfterCommit();
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

        PointUsed pointUsed = new PointUsed(point);
        pointUsed.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(hotelReserved.get???()).ifPresent(point->{
            
            point // do something
            repository().save(point);

            PointUsed pointUsed = new PointUsed(point);
            pointUsed.publishAfterCommit();

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

        */

        /** Example 2:  finding and process
        
        repository().findById(hotelCancelled.get???()).ifPresent(point->{
            
            point // do something
            repository().save(point);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
