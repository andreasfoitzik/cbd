package dash.inquirermanagement;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Andreas on 12.10.2015.
 */

@RestController
@RequestMapping(value="/inquirer")
@Api(value = "inquirers", description = "Inquirer API")
public class InquirerResource {

        @Autowired
        private InquirerRepository inquirerRepository;

        @RequestMapping(method = RequestMethod.GET)
        @ResponseStatus(HttpStatus.OK)
        @ApiOperation(value = "Get all Inquirers", notes = "You have to provide a valid hotel ID.")
        public Iterable<Inquirer> get() {
                return inquirerRepository.findAll();
        }

        @RequestMapping(method = RequestMethod.GET,
                        value="{id}")
        @ResponseStatus(HttpStatus.OK)
        @ApiOperation(value = "Get a single inquirer.", notes = "You have to provide a valid inquirer ID.")
        public Inquirer findById(@PathVariable Long id) {
                return inquirerRepository.findOne(id);
        }

        @RequestMapping(method = RequestMethod.POST,
                        consumes = {MediaType.APPLICATION_JSON_VALUE},
                        produces = {MediaType.APPLICATION_JSON_VALUE})
        @ResponseStatus(HttpStatus.CREATED)
        @ApiOperation(value = "Create a Inquirer Entity.", notes = "Returns the URL of the new resource in the Location header.")
        public ResponseEntity<Void> add(@RequestBody Inquirer inquirer) {
                System.out.println(inquirer);
                inquirerRepository.save(inquirer);
                return new ResponseEntity<Void>(HttpStatus.OK);
        }

        @RequestMapping(method=RequestMethod.PUT,
                        value="{id}",
                        consumes = {MediaType.APPLICATION_JSON_VALUE},
                        produces = {MediaType.APPLICATION_JSON_VALUE})
        @ResponseStatus(HttpStatus.NO_CONTENT)
        @ApiOperation(value = "Update a single inquirer.", notes = "You have to provide a valid inquirer ID.")
        public Inquirer update(@PathVariable Long id, @RequestBody Inquirer contact) {
                Inquirer inquirer = inquirerRepository.findOne(id);
                inquirer.setFirstname(contact.getFirstname());
                inquirer.setLastname(contact.getLastname());
                inquirer.setCompany(contact.getCompany());
                inquirer.setEmail(contact.getEmail());
                return inquirer;
        }

        @RequestMapping(method = RequestMethod.DELETE)
        @ResponseStatus(HttpStatus.NO_CONTENT)
        @ApiOperation(value = "Delete a single inquirer.", notes = "You have to provide a valid inquirer ID.")
        public void delete(@PathVariable Long id) {
                inquirerRepository.delete(id);
        }
}

