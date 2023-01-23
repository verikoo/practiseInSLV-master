package xml.jaxb;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;

@XmlRootElement
@XmlType(name = "Customers")
@XmlAccessorType(XmlAccessType.FIELD)
public class Customers {

    @XmlElement(name = "customers")
    private ArrayList<Customer> customerList = new ArrayList<Customer>();

    public Customers(){}

    public void setCustomerList(ArrayList<Customer> customerList){
        this.customerList= customerList;
    }


    public boolean addCustomer(Customer customer) {
        return customerList.add(customer);
    }


    @Override
    public String toString(){
        return "Customers{" +
                "customerList" +
                customerList+
                "}";
    }
}
