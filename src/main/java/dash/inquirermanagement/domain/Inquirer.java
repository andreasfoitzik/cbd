package dash.inquirermanagement.domain;

/**
 * Created by Andreas on 10.10.2015.
 */
public class Inquirer {

    private String id;
    private String firstname;
    private String lastname;
    private String company;
    private String email;

    public Inquirer (){
    }

    public Inquirer(String firstname, String lastname, String company, String email){
        this.firstname = firstname;
        this.lastname = lastname;
        this.company = company;
        this.email = email;
    }
}
