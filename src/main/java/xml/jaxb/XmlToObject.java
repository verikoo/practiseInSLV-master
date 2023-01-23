package xml.jaxb;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class XmlToObject {
    private final static Logger LOGGER = LogManager.getLogger(XmlToObject.class);
    public static void main(String[] args) {
        try{
            FileReader customerJaxb = new FileReader("src/main/resources/xml/customerJaxb.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Customer c = (Customer) jaxbUnmarshaller.unmarshal(customerJaxb);
            LOGGER.info(c);

        }catch(JAXBException | FileNotFoundException e){
            LOGGER.error(e);
        }

    }
}
