package dash.inquirermanagement;

import dash.usermanagement.User;
import dash.usermanagement.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Andreas on 12.10.2015.
 */

@RestController
@RequestMapping(value="/inquirer")
public class InquirerController {

        @Autowired
        private InquirerRepository inquirerRepository;

        @RequestMapping(method = RequestMethod.GET)
        public Iterable<Inquirer> get() {

                Inquirer inquirer = new Inquirer();
                inquirer.setFirstname("Andreas");
                inquirer.setLastname("Foitzik");
                inquirer.setCompany("get-net");
                inquirer.setEmail("andreas.foitzik@live.com");
                inquirerRepository.save(inquirer);

                Inquirer inquirer2 = new Inquirer();
                inquirer.setFirstname("Andreas");
                inquirer.setLastname("Foitzik");
                inquirer.setCompany("get-net");
                inquirer.setEmail("andreas.foitzik@live.com");
                inquirerRepository.save(inquirer2);

                return inquirerRepository.findAll();
        }

}

