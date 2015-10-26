package dash.applicationmanagement;

import dash.Status;
import dash.containermanagement.Container;
import dash.inquirermanagement.Inquirer;
import dash.vendormanagement.Vendor;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Andreas on 09.10.2015.
 */
@Entity
public class Application {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @OneToOne
    private Inquirer inquirer;
    @OneToOne
    private Vendor vendor;
    @OneToMany
    private List<Container> container;

    private String containerAmount;
    private boolean transport;
    private String destination;
    private String compareableProposal;
    private String message;
    private Status status;

    protected Application(){}

    public Inquirer getInquirer() {
        return inquirer;
    }

    public void setInquirer(Inquirer inquirer) {
        this.inquirer = inquirer;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public List<Container> getContainer() {
        return container;
    }

    public void setContainer(List<Container> container) {
        this.container = container;
    }

    public String getContainerAmount() {
        return containerAmount;
    }

    public void setContainerAmount(String containerAmount) {
        this.containerAmount = containerAmount;
    }

    public boolean isTransport() {
        return transport;
    }

    public void setTransport(boolean transport) {
        this.transport = transport;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getCompareableProposal() {
        return compareableProposal;
    }

    public void setCompareableProposal(String compareableProposal) {
        this.compareableProposal = compareableProposal;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
