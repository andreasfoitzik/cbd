package dash.applicationmanagement;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import dash.applicationmanagement.Application;
import dash.containermanagement.Container;
import dash.containermanagement.ContainerRepository;
import dash.inquirermanagement.InquirerRepository;
import dash.vendormanagement.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andreas on 12.10.2015.
 */
@RestController
@RequestMapping(value="/application")
@Api(value = "applications", description = "Application API")
public class ApplicationResource {

    @Autowired
    private ApplicationRepository applicationRepository;

    @Autowired
    private ContainerRepository containerRepository;

    @Autowired
    private InquirerRepository inquirerRepository;

    @Autowired
    private VendorRepository vendorRepository;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Application> get() {
        return applicationRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET,
            value="{id}")
    @ResponseStatus(HttpStatus.OK)
    public Application findById(@PathVariable Long id) {
        return applicationRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST,
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Void> add(@RequestBody Application application) {

        inquirerRepository.save(application.getInquirer());
        vendorRepository.save(application.getVendor());
        containerRepository.save(application.getContainer());

        applicationRepository.save(application);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @RequestMapping(method=RequestMethod.PUT,
            value="{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Application update(@PathVariable Long id, @RequestBody Application updateContainer) {
        Application application = applicationRepository.findOne(id);

        return application;
    }

    @RequestMapping(method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ApiOperation(value = "Delete a single application.", notes = "You have to provide a valid application ID.")
    public void delete(@PathVariable Long id) {
        applicationRepository.delete(id);
    }
}
