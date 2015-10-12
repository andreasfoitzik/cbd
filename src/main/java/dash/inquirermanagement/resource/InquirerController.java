package dash.inquirermanagement.resource;

import dash.applicationmanagement.domain.Application;
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
public class InquirerController {

    public InquirerController() {
        super();
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Inquirer>> get() {

        List<Inquirer> inquirers = new ArrayList<Inquirer>();

        inquirers.add(new Inquirer());

        return new ResponseEntity<List<Inquirer>>(inquirers, HttpStatus.OK);
    }
}

