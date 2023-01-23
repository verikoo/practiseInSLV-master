package xml.jaxb;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class Customer {
    @XmlAttribute(name = "id", required = true)
    private long id;

    @XmlAttribute(name = "Name", required = true)
    private  String name;

    @XmlAttribute(name="Surname", required = true)
    private String surname;

    @XmlAttribute(name="Contact_Number", required = true)
    private String contactNumber;

    @XmlAttribute(name="Email", required = true)
    private String email;

    @XmlAttribute(name = "Address", required = true)
    private String address;

    @XmlAttribute(name= "Purchase_History", required = true)
    private String purchaseHistory;

    public Customer(){}

    public Customer(long id, String name, String surname, String contactNumber, String email, String address, String purchaseHistory) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.contactNumber = contactNumber;
        this.email = email;
        this.address = address;
        this.purchaseHistory = purchaseHistory;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPurchaseHistory(String purchaseHistory) {
        this.purchaseHistory = purchaseHistory;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "id=" + id +
                ", Name='" + name + '\'' +
                ", Surname='" + surname + '\'' +
                ", Contact_Number=" + contactNumber +
                ", Email='" + email + '\'' +
                ", Address='" + address + '\'' +
                ", Purchase_History=" + purchaseHistory +
                '}';
    }
}
