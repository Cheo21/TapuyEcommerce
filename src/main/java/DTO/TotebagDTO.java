package DTO;

import Entity.Product;

import java.util.Date;

public class TotebagDTO extends ProductDTO {
    private Double capacityInLiters;

    public TotebagDTO(Double price, String topic, Date creationDate, String description, Double capacityInLiters) {
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