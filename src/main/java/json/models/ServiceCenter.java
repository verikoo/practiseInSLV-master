package json.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ServiceCenter {
    @JsonProperty("id")
    private long id;

    @JsonProperty("Center_Name")
    private String centName;

    @JsonProperty("Center_Address")
    private String centAddress;

    @JsonProperty("Contact_Number")
    private String contNumber;

    @JsonProperty("Address")
    private String address;

    @JsonProperty("Email")
    private String email;


    public ServiceCenter(){}

    public ServiceCenter(long id, String centName, String centAddress, String contNumber, String address, String email) {
        this.id = id;
        this.centName = centName;
        this.centAddress = centAddress;
        this.contNumber = contNumber;
        this.address = address;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCentName() {
        return centName;
    }

    public void setCentName(String centName) {
        this.centName = centName;
    }

    public String getCentAddress() {
        return centAddress;
    }

    public void setCentAddress(String centAddress) {
        this.centAddress = centAddress;
    }

    public String getContNumber() {
        return contNumber;
    }

    public void setContNumber(String contNumber) {
        this.contNumber = contNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return "Service_Center{" +"\n" +
                "id=" + id + "\n" +
                "Center_Name='" + centName + "\n" +
                "Center_Address=" + centAddress + "\n" +
                "Contact_Number=" + contNumber + "\n" +
                "Address=" + address + "\n" +
                "Email=" + email + "\n" +
                '}';
    }
}
