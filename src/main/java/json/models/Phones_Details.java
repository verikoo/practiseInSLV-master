package json.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Phones_Details {
    @JsonProperty("id")
    private Long id;

    @JsonProperty("Phone_Brand")
    private String brand;

    @JsonProperty("Phone_Model")
    private String model;

    @JsonProperty("Color")
    private String color;

    @JsonProperty("ROM")
    private int rom;

    @JsonProperty("RAM")
    private String ram;

    @JsonProperty("Battery")
    private String battery;

    @JsonProperty("Price")
    private double price;

    @JsonProperty("Phones_id")
    private Long phoneId;

    public Phones_Details(long id, String apple, String model, String grey, int rom, String ram, String battery, double price){}

    public Phones_Details(Long id, String brand, String model, String color, int rom, String ram, String battery, double price, Long phoneId) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.rom = rom;
        this.ram = ram;
        this.battery = battery;
        this.price = price;
        this.phoneId = phoneId;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRom() {
        return rom;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Long getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(Long phoneId) {
        this.phoneId = phoneId;
    }


    @Override
    public String toString(){
        return "Deliveries{" +"\n" +
                "id=" + id + "\n" +
                "Phone_Brand='" + brand + "\n" +
                "Phone_Model=" + model + "\n" +
                "Color=" + color + "\n" +
                "ROM=" + rom + "\n" +
                "RAM=" + ram + "\n" +
                "Battery=" + battery + "\n" +
                "Price=" + price + "\n" +
                "Phones_id=" + phoneId + "\n" +
                '}';
    }
}
