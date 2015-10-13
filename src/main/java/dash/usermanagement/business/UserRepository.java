package dash.usermanagement.business;

import java.util.List;

import dash.usermanagement.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Component;

/**
 * Created by Andreas on 12.10.2015.
 */
@Component
public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findAll();

}