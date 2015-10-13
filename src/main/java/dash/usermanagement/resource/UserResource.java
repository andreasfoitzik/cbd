package dash.usermanagement.resource;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import dash.vendormanagement.domain.Vendor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import dash.usermanagement.domain.User;

/**
 * Created by Andreas on 09.10.2015.
 */
@Component
@RestController
@RequestMapping(value="/user",
        produces={MediaType.APPLICATION_JSON_VALUE},
        consumes = {MediaType.APPLICATION_JSON_VALUE})
public class UserResource {

    public UserResource() {
        super();
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<User>> get() {

        List<User> users = new ArrayList<User>();

        users.add(new User("Andreas","Foitzik","andreas.foitzik","andreas.foitzik@live.com"));

        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }

}
