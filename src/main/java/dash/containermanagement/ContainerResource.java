package dash.containermanagement;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import dash.vendormanagement.Vendor;
import dash.vendormanagement.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Andreas on 12.10.2015.
 */
@Component
@RestController
@RequestMapping(value="/container")
@Api(value = "containers", description = "Container API")
public class ContainerResource {

        @Autowired
        private ContainerRepository containerRepository;

        @RequestMapping(method = RequestMethod.GET)
        @ResponseStatus(HttpStatus.OK)
        public Iterable<Container> get() {
                return containerRepository.findAll();
        }

        @RequestMapping(method = RequestMethod.GET,
                value="{id}")
        @ResponseStatus(HttpStatus.OK)
        public Container findById(@PathVariable Long id) {
                return containerRepository.findOne(id);
        }

        @RequestMapping(method = RequestMethod.POST,
                consumes = {MediaType.APPLICATION_JSON_VALUE},
                produces = {MediaType.APPLICATION_JSON_VALUE})
        @ResponseStatus(HttpStatus.CREATED)
        public ResponseEntity<Void> add(@RequestBody Container container) {
                System.out.println(container);
                containerRepository.save(container);
                return new ResponseEntity<Void>(HttpStatus.OK);
        }

        @RequestMapping(method=RequestMethod.PUT,
                value="{id}",
                consumes = {MediaType.APPLICATION_JSON_VALUE},
                produces = {MediaType.APPLICATION_JSON_VALUE})
        @ResponseStatus(HttpStatus.NO_CONTENT)
        public Container update(@PathVariable Long id, @RequestBody Container updateContainer) {
                Container container = containerRepository.findOne(id);
                container.setName(updateContainer.getName());
                container.setDescription(updateContainer.getDescription());
                container.setPrice(updateContainer.getPrice());
                return container;
        }

        @RequestMapping(method = RequestMethod.DELETE)
        @ResponseStatus(HttpStatus.NO_CONTENT)
        @ApiOperation(value = "Delete a single container.", notes = "You have to provide a valid container ID.")
        public void delete(@PathVariable Long id) {
                containerRepository.delete(id);
        }
}
