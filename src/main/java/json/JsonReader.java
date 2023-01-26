package json;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import json.models.Customers;
import json.models.Phones;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class JsonReader {
    private static  final Logger LOGGER = LogManager.getLogger(JsonReader.class);

    public static void main(String[] args) {
        ObjectMapper objMapper = new ObjectMapper();
        try{
            JavaType javaType =  objMapper.getTypeFactory().constructCollectionType(List.class, Customers.class);
            JavaType javaType1 = objMapper.getTypeFactory().constructCollectionType(List.class, Phones.class);
            List<Customers> customersList = objMapper.readValue(new FileReader("src/main/resources/json/customers.json"), javaType);
            List<Phones> phonesList = objMapper.readValue(new FileReader("src/main/resources/json/phonesWrite.json"), javaType1);
            LOGGER.info(customersList);
            LOGGER.info(phonesList);

        }catch(IOException e){
            LOGGER.error(e);
        }
    }
}
