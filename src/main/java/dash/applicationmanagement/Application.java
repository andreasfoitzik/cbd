package dash.applicationmanagement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Andreas on 09.10.2015.
 */
@Entity
public class Application {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    // Class - Inquirer
    private String firstname;
    private String lastname;
    private String company;
    private String email;

    // Class - vendor
    private String vendor;
    private String phone;

    // Class - container
    private String container;
    private String containerId;
    private String containerName;

    private String containerAmount;
    private boolean transport;
    private String destination;
    private String compareableProposal;
    private String message;

    protected Application(){}
}
