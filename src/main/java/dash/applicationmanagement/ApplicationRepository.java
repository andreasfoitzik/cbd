package dash.applicationmanagement;

import dash.applicationmanagement.Application.Status;
import dash.inquirermanagement.Inquirer;
import dash.usermanagement.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by Andreas on 12.10.2015.
 */

@Repository
public interface ApplicationRepository extends CrudRepository<Application, Long> {

    public Iterable<Application> findApplicationsByStatus(@Param("status") Status status);

    public Iterable<Application> findApplicationByMessage(@Param("message") String message);

}
