package dash.applicationmanagement;

import dash.applicationmanagement.Application;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andreas on 12.10.2015.
 */
@RestController
@RequestMapping(value="/application")
public class ApplicationResource {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Application>> get() {

        List<Application> application = new ArrayList<Application>();

        application.add(new Application());
        return new ResponseEntity<List<Application>>(application, HttpStatus.OK);
    }
}
