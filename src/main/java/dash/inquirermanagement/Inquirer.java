package dash.inquirermanagement;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Andreas on 10.10.2015.
 */
@Entity
public class Inquirer {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String firstname;
    private String lastname;
    private String company;
    private String email;

    protected Inquirer(){}

    public Long getId() { return id; }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) { this.firstname = firstname; }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}