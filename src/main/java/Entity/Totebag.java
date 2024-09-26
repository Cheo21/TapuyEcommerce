package Entity;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@DiscriminatorValue("TOTE") // Valor para el tipo de producto
public class Totebag extends Product  {



    private Double capacityInLiters;


    public Totebag() {
     super();
    }
    public Totebag(Double price, String topic, Date creationDate, String description, Double capacityInLiters) {
        super(price, topic, creationDate, description);
        this.capacityInLiters = capacityInLiters;
    }



    public Double getCapacityInLiters() {
        return capacityInLiters;
    }

    public void setCapacityInLiters(Double capacityInLiters) {
        this.capacityInLiters = capacityInLiters;
    }
}
