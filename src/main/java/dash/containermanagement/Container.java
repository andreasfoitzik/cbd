package dash.containermanagement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Andreas on 10.10.2015.
 */
@Entity
public class Container implements Serializable {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String description;
    private double price;

    protected Container(){}

    public Container(String name, String description, double price){
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public Long getId () {return id; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
