import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by Andreas on 09.10.2015.
 */

@ComponentScan("dash")
@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"dash.usermanagement"})
@EnableJpaRepositories(basePackages = {"dash.usermanagement"})
@EnableTransactionManagement
@SpringBootApplication

public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }
}