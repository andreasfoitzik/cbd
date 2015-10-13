package dash.applicationmanagement.resource;

import dash.applicationmanagement.domain.Application;
import dash.usermanagement.domain.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Andreas on 12.10.2015.
 */
@Component
@RestController
@RequestMapping(value="/application",
        produces={MediaType.APPLICATION_JSON_VALUE},
        consumes = {MediaType.APPLICATION_JSON_VALUE})
public class ApplicationResource {

    public ApplicationResource() {
        super();
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Application>> get() {

        List<Application> application = new ArrayList<Application>();

        application.add(new Application());
        return new ResponseEntity<List<Application>>(application, HttpStatus.OK);
    }
}