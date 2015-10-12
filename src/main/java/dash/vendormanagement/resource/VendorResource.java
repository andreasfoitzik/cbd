package dash.vendormanagement.resource;

import dash.inquirermanagement.domain.Inquirer;
import dash.usermanagement.domain.User;
import dash.vendormanagement.domain.Vendor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Andreas on 12.10.2015.
 */
@Component
@RestController
@RequestMapping(value="/application",
        produces={MediaType.APPLICATION_JSON_VALUE},
        consumes = {MediaType.APPLICATION_JSON_VALUE})
public class VendorResource {

        public VendorResource() {
            super();
        }

        @RequestMapping(method = RequestMethod.GET)
        public ResponseEntity<List<Vendor>> get() {

            List<Vendor> vendors = new ArrayList<Vendor>();

            vendors.add(new Vendor());

            return new ResponseEntity<List<Vendor>>(vendors, HttpStatus.OK);
        }
}
