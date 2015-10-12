package dash.vendormanagement.domain;

/**
 * Created by Andreas on 10.10.2015.
 */
public class Vendor {

    private String id;
    private String name;
    private String phone;

    public Vendor(){
    }

    public Vendor(String id, String name, String phone){
        this.name = name;
        this.phone = phone;
    }
}
