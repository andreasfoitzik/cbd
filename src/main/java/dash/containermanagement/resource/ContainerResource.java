package dash.containermanagement.resource;

import dash.containermanagement.domain.Container;
import dash.inquirermanagement.domain.Inquirer;
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
@Component
@RestController
@RequestMapping(value="/application",
        produces={MediaType.APPLICATION_JSON_VALUE},
        consumes = {MediaType.APPLICATION_JSON_VALUE})
public class ContainerResource {

    public ContainerResource() {
        super();
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Container>> get() {

        List<Container> containers = new ArrayList<Container>();

        containers.add(new Container());

        return new ResponseEntity<List<Container>>(containers, HttpStatus.OK);
    }
}
