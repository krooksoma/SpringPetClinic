package petdata.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
// the following annotation establishes this class as a base class
@MappedSuperclass
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {return id;}

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isNew(){
        return this.id == null;
    }

}
