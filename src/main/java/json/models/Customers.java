package json.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Customers {
    @JsonProperty("Name")
    private String name;

    @JsonProperty("Surname")
    private String surname;

    @JsonProperty("Contact_Number")
    private String contactNumber;

    @JsonProperty("Email")
    private String email;

    @JsonProperty("Address")
    private String address;

    @JsonProperty("Purchase_History")
    private String purchaseHistory;

    Customers(){}

    public Customers(String name, String surname, String contactNumber, String email, String address, String purchaseHistory) {
        this.name = name;
        this.surname = surname;
        this.contactNumber = contactNumber;
        this.email = email;
        this.address = address;
        this.purchaseHistory = purchaseHistory;
    }

    public Customers(String name, String surname, String contactNumber, String email, String purchaseHistory) {
        this.name = name;
        this.surname = surname;
        this.contactNumber = contactNumber;
        this.email = email;
        this.purchaseHistory = purchaseHistory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPurchaseHistory() {
        return purchaseHistory;
    }

    public void setPurchaseHistory(String purchaseHistory) {
        this.purchaseHistory = purchaseHistory;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString(){
        return "Customers{" +
                ", Name='" + name + '\'' +
                ", Surname='" + surname + '\'' +
                ", Contact_Number=" + contactNumber +
                ", Email='" + email + '\'' +
                ", Address='" + address + '\'' +
                ", Purchase_History=" + purchaseHistory +
                '}';
    }
}
