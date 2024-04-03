package hotelreservation.domain;

import hotelreservation.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "cleans", path = "cleans")
public interface CleanRepository
    extends PagingAndSortingRepository<Clean, Long> {}