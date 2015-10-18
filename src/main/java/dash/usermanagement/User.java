package dash.usermanagement;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;

/**
 * Created by Andreas on 09.10.2015.
 */
@Entity
@Table(name="dash.usermanagement.User")
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    @Column
    private String firstname;
    @Column
    private String lastname;
    @Column
    private String username;
    @Column
    private String email;

    public User (){}

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString(){
        return "dash.usermanagement.User: " + this.firstname + " " + this.lastname + " with Username " + this.username + " " + this.email;
    }
}
