package dash.usermanagement;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by Andreas on 12.10.2015.
 */
@Component
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    Page<User> findAll(Pageable pageable);
}