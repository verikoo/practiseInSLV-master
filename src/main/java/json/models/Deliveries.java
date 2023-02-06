package json.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Deliveries {
    @JsonProperty("id")
    private long id;

    @JsonProperty("Delivery_Address")
    private String delAddress;

    @JsonProperty("Delivery_Status")
    private String delStatus;

    @JsonProperty("Purchase_Cost")
    private String purchCost;

    @JsonProperty("Purchase_Status")
    private String purchStatus;

    Deliveries() {
    }

    public Deliveries(long id, String delAddress, String delStatus, String purchCost, String purchStatus) {
        this.id = id;
        this.delAddress = delAddress;
        this.delStatus = delStatus;
        this.purchCost = purchCost;
        this.purchStatus = purchStatus;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDelAddress() {
        return delAddress;
    }

    public void setDelAddress(String delAddress) {
        this.delAddress = delAddress;
    }

    public String getDelStatus() {
        return delStatus;
    }

    public void setDelStatus(String delStatus) {
        this.delStatus = delStatus;
    }

    public String getPurchCost() {
        return purchCost;
    }

    public void setPurchCost(String purchCost) {
        this.purchCost = purchCost;
    }

    public String getPurchStatus() {
        return purchStatus;
    }

    public void setPurchStatus(String purchStatus) {
        this.purchStatus = purchStatus;
    }

    @Override
    public String toString() {
        return "Deliveries{" + "\n" + "Delivery_Address=" + delAddress + "\n" + "Delivery_Status='" + delStatus + "\n" + "Purchase_Cost=" + purchCost + "\n" + "Purchase_Status=" + purchStatus + "\n" + '}';
    }
}
