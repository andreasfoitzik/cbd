package dash.usermanagement.resource;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import dash.usermanagement.domain.User;

/**
 * Created by Andreas on 09.10.2015.
 */
@Component
@RestController
public class UserResource {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/user")
    public User greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new User("Andreas","Foitzik","andreasfoitzik","andreas.foitzik@live.com");
    }
}
