package dash.usermanagement.domain;

import org.springframework.stereotype.Component;

/**
 * Created by Andreas on 09.10.2015.
 */

@Component
public class User {

    private String firstname;
    private String lastname;
    private String username;
    private String email;

    public User(){
    }
    public User(String firstname,String lastname,String username,String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.email = email;
    }

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

}
