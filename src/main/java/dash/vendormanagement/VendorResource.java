package dash.vendormanagement;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import dash.usermanagement.User;
import dash.usermanagement.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Andreas on 12.10.2015.
 */

@RestController
@RequestMapping(value="/vendors")
@Api(value = "vendors", description = "Vendor API")
public class VendorResource {

        @Autowired
        private VendorRepository vendorRepository;

        @RequestMapping(method = RequestMethod.GET)
        @ResponseStatus(HttpStatus.OK)
        public Iterable<Vendor> get() {
                return vendorRepository.findAll();
        }

        @RequestMapping(method = RequestMethod.GET,
                value="{id}")
        @ResponseStatus(HttpStatus.OK)
        public Vendor findById(@PathVariable Long id) {
                return vendorRepository.findOne(id);
        }

        @RequestMapping(method = RequestMethod.POST,
                consumes = {MediaType.APPLICATION_JSON_VALUE},
                produces = {MediaType.APPLICATION_JSON_VALUE})
        @ResponseStatus(HttpStatus.CREATED)
        public ResponseEntity<Void> add(@RequestBody Vendor vendor) {
                System.out.println(vendor);
                vendorRepository.save(vendor);
                return new ResponseEntity<Void>(HttpStatus.OK);
        }

        @RequestMapping(method=RequestMethod.PUT,
                value="{id}",
                consumes = {MediaType.APPLICATION_JSON_VALUE},
                produces = {MediaType.APPLICATION_JSON_VALUE})
        @ResponseStatus(HttpStatus.NO_CONTENT)
        public Vendor update(@PathVariable Long id, @RequestBody Vendor updateVendor) {
                Vendor vendor = vendorRepository.findOne(id);
                vendor.setName(updateVendor.getName());
                vendor.setPhone(updateVendor.getPhone());
                return vendor;
        }

        @RequestMapping(method = RequestMethod.DELETE)
        @ResponseStatus(HttpStatus.NO_CONTENT)
        @ApiOperation(value = "Delete a single vendor.", notes = "You have to provide a valid vendor ID.")
        public void delete(@PathVariable Long id) {
                vendorRepository.delete(id);
        }
}
