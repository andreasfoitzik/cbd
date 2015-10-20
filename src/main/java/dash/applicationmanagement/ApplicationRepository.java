package dash.applicationmanagement;

import dash.usermanagement.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by Andreas on 12.10.2015.
 */
@Repository
public interface ApplicationRepository extends CrudRepository<Application, Long> {

}