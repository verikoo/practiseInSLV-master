package json.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Phones {
    @JsonProperty("id")
    private Long id;

    @JsonProperty("Brand")
    private String brand;

    @JsonProperty("Model")
    private String model;

    @JsonProperty("Release_Date")
    private Date releaseDate;

    Phones(){}

    public Phones(Long id, String brand, String model, Date releaseDate) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.releaseDate = releaseDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString(){
        return "Phones{"+ "\n"+
                "id=" + id + "\n"+
                "Brand='"+brand+"\n"+
                "Model='"+model+"\n"+
                "Release_Date="+releaseDate+"\n"+
                '}';
    }
}
