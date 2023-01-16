package newdatabaseproject.models;

public class Customers {
    private Long id;
    private String name;
    private String surName;
    private String contactNumber;
    private String email;
    private String address;
    private String purchaseHistory;

    public Customers(){}

    public Customers(Long id, String name, String surName, String contactNumber, String email, String address, String purchaseHistory){
        this.id = id;
        this.name=name;
        this.surName=surName;
        this.contactNumber=contactNumber;
        this.email=email;
        this.address=address;
        this.purchaseHistory=purchaseHistory;
    }

    public Long getId(){return id;}

    public void setId(Long id){this.id=id;}

    public String getName(){return name;}

    public void setName(String name){this.name=name;}

    public String getSurName(){return surName;}

    public  void setSurName(String surName){this.surName= surName;}

    public String getContactNumber(){return  contactNumber;}

    public void setContactNumber(String contactNumber){this.contactNumber=contactNumber;}

    public String getEmail(){return email;}

    public void setEmail(String email){this.email=email;}

    public String getAddress(){return address;}

    public void setAddress(String address){this.address=address;}

    public String getPurchaseHistory(){return purchaseHistory;}

    public void setPurchaseHistory(String purchaseHistory){this.purchaseHistory=purchaseHistory;}


    @Override
    public String toString() {
        return "Customers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", contactNumber=" + contactNumber +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", purchaseHistory=" + purchaseHistory +
                '}';
    }
}
