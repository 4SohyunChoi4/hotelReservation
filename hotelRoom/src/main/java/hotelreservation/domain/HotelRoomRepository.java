package hotelreservation.domain;

import hotelreservation.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "hotelRooms",
    path = "hotelRooms"
)
public interface HotelRoomRepository
    extends PagingAndSortingRepository<HotelRoom, Long> {}
