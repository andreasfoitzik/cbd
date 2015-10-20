package dash.containermanagement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Andreas on 10.10.2015.
 */
@Entity
public class Container {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    protected Container(){}
}
