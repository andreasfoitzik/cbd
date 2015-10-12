package dash.usermanagement.business;

import java.util.List;

import dash.usermanagement.domain.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by Andreas on 12.10.2015.
 */

@RepositoryRestResource(collectionResourceRel = "users", path = "user")
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

    List<User> findByLastName(@Param("lastname") String lastname);

}