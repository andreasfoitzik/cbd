package dash.usermanagement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by Andreas on 09.10.2015.
 */
@RestController
@RequestMapping(value="/user")
public class UserResource {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<User> get() {

        User user = new User();
        user.setFirstname("Andreas");
        user.setLastname("Foitzik");
        user.setUsername("andreasfoitzik");
        user.setEmail("andreas.foitzik@live.com");
        userRepository.save(user);

        User user2 = new User();
        user2.setFirstname("Andreas");
        user2.setLastname("Foitzik");
        user2.setUsername("andreasfoitzik");
        user2.setEmail("andreas.foitzik@live.com");
        userRepository.save(user2);


        return userRepository.findAll();
    }
}
