package json;

import com.fasterxml.jackson.databind.ObjectMapper;
import json.models.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.List;


public class JsonWriter {
    private static final Logger LOGGER = LogManager.getLogger(JsonReader.class);

    public static void main(String[] args) {
        ObjectMapper objMapper = new ObjectMapper();
        try{
            objMapper.writerWithDefaultPrettyPrinter().writeValue(new File("src/main/resources/json/customerWrite.json"),getCustomers());
            objMapper.writerWithDefaultPrettyPrinter().writeValue(new File("src/main/resources/json/phonesWrite.json"), getPhones());
            objMapper.writerWithDefaultPrettyPrinter().writeValue(new File("src/main/resources/json/deliveriesWrite.json"), getDeliveries());
            objMapper.writerWithDefaultPrettyPrinter().writeValue(new File("src/main/resources/json/phonesDetailWrite.json"), getPhonesDetail());
            objMapper.writerWithDefaultPrettyPrinter().writeValue(new File("src/main/resources/json/serviceCenterWrite.json"), getServiceCenter());
            LOGGER.info("File created successfully ");
        }catch(IOException e){
            LOGGER.error(e);
        }
    }

    public static List<Customers> getCustomers(){
        return List.of(
                new Customers("Nick", "Stiuart", "+902-12-33-99", "email@example.com", "ckhakaia str 23", "no hist"),
                new Customers("Steven", "Cyrus",  "+901-88-66-77-44", "cyrus@example.com", "tavartqiladze str 1", "no hist"),
                new Customers("Jhon", "Doe", "555-555-5555","johndoe@example.com", "123 Main St, Anytown USA","no hist"),
                new Customers( "Jane", "Smith", "555-555-5555",  "janesmith@example.com",  "456 Park Ave, Anycity USA", "no hist")
        );
    }

    public static List<Phones> getPhones(){
        return List.of(
                new Phones(1L,"Samsung","Galaxy s7",new Date(1262289600)),
                new Phones(2L, "Apple", "Iphone 14 pro", new Date(1663790400))
        );
    }

    public static List<Deliveries> getDeliveries(){
        return List.of(
                new Deliveries(1L, "chavchavadze str 3", "prepearing", "123 gel", "purchased"),
                new Deliveries(2L,"tbilisi pekini str 2", "ready for delivery", "234gel" , "filed")
        );
    }

    public static List<Phones_Details> getPhonesDetail(){
        return List.of(
                new Phones_Details(1L, "Apple", "Iphone 14 pro","grey",5,"128gb","SNSOU 4500mAh EB-BG935ABE Li-Polymer", 1299.23,2L)
        );
    }

    public static List<ServiceCenter> getServiceCenter(){
        return List.of(
                new ServiceCenter(1L,"Service center in batumi","batumi zubalashbili str 3","+234-342-22","main address", "service@example.com")
        );
    }
}
