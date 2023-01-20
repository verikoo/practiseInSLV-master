package newdatabaseproject.models;

public class Inventory {
    private Long id;
    private String quantity;
    private String inventorycol;

    public Inventory(){}
    public Inventory(Long id, String quantity, String inventorycol) {
        this.id = id;
        this.quantity = quantity;
        this.inventorycol = inventorycol;
    }

    public Long getId() {
        return id;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getInventorycol() {
        return inventorycol;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setQuantity(String quantity) {
        quantity = quantity;
    }

    public void setInventorycol(String inventorycol) {
        inventorycol = inventorycol;
    }

    @Override
    public String toString() {
        return "Deliveries{" +
                "id=" + id +
                ", quantity='" + quantity + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
