package dash.usermanagement;

import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created by Andreas on 09.10.2015.
 */
@Component
@Controller
/*@RequestMapping(value="/user",
        produces = {MediaType.APPLICATION_JSON_VALUE},
        consumes = {MediaType.APPLICATION_JSON_VALUE})
        */
@RequestMapping(value="/user")
public class UserResource {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<dash.usermanagement.User>> get() {

        List<dash.usermanagement.User> users = new ArrayList<dash.usermanagement.User>();

        User user = new User();
        user.setFirstname("Andreas");
        user.setLastname("Foitzik");
        user.setUsername("andreasfoitzik");
        user.setEmail("andreas.foitzik@live.com");
        userRepository.save(user);
        //users.add(new dash.usermanagement.User("Andreas","Foitzik","andreas.foitzik","andreas.foitzik@live.com"));

        return new ResponseEntity<List<dash.usermanagement.User>>(users, HttpStatus.OK);
    }
}
