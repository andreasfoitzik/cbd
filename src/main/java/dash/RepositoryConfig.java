package dash;

import dash.containermanagement.Container;
import dash.inquirermanagement.Inquirer;
import dash.usermanagement.User;
import dash.vendormanagement.Vendor;
import org.springframework.boot.autoconfigure.data.rest.SpringBootRepositoryRestMvcConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

/**
 * Created by Andreas on 03.11.2015.
 */
@Configuration
public class RepositoryConfig extends SpringBootRepositoryRestMvcConfiguration {

    @Override
    protected void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(dash.applicationmanagement.Application.class, Container.class, Inquirer.class, User.class, Vendor.class);
    }

    @Override
    public RepositoryRestConfiguration config() {
        RepositoryRestConfiguration config = super.config();
        config.setBaseUri("/api/rest");
        return config;
    }
}
