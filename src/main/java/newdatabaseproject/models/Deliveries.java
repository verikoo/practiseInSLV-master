package newdatabaseproject.models;

public class Deliveries {
    private Long id;
    private String deliveryAddress;
    private String deliveryStatus;
    private String purchaseCost;
    private String purchaseStatus;

    public Deliveries(){}

    public Deliveries(Long id, String deliveryAddress, String deliveryStatus, String purchaseCost, String purchaseStatus) {
        this.id = id;
        this.deliveryAddress = deliveryAddress;
        this.deliveryStatus = deliveryStatus;
        this.purchaseCost = purchaseCost;
        this.purchaseStatus = purchaseStatus;
    }

    public Long getId() {
        return id;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public String getPurchaseCost() {
        return purchaseCost;
    }

    public String getPurchaseStatus() {
        return purchaseStatus;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public void setPurchaseCost(String purchaseCost) {
        this.purchaseCost = purchaseCost;
    }

    public void setPurchaseStatus(String purchaseStatus) {
        this.purchaseStatus = purchaseStatus;
    }

    @Override
    public String toString() {
        return "Deliveries{" +
                "id=" + id +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", deliveryStatus=" + deliveryStatus +
                ", purchaseCost=" + purchaseCost +
                ", purchaseStatus=" + purchaseStatus +
                '}';
    }
}
