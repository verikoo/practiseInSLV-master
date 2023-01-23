package xml.jaxb;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ObjectToXml {
    private final static Logger LOGGER = LogManager.getLogger(ObjectToXml.class);
    public static void main(String[] args) throws JAXBException, FileNotFoundException {
        try{
            JAXBContext contentOBJ = JAXBContext.newInstance(Customers.class);

            Marshaller marshallerOBJ = contentOBJ.createMarshaller();
            marshallerOBJ.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            Customer cust1 = new Customer(1,"custoemr1", "bregvadze","+900-34-32-111","email@example.com", "asatiani str 12", "no hist");
            marshallerOBJ.marshal(cust1, new FileOutputStream("src/main/resources/xml/customerJaxb.xml"));
            LOGGER.info("object is written successfully");
        }catch(JAXBException e){
            LOGGER.error(e);
        }

    }
}
