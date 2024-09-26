package DTO;

import java.util.Date;

public class ProductDTO {
    private Integer id;
    private Double prices;
    private String topic;
    private Date creationDate;
    private String description;

    public ProductDTO(Double price, String topic, Date creationDate, String description) {
    this.prices = price;
    this.topic = topic;
    this.creationDate = creationDate;
    this.description = description;


    }

    // Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPrices() {
        return prices;
    }

    public void setPrices(Double prices) {
        this.prices = prices;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}