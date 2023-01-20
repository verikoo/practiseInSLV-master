package xml;

import newdatabaseproject.models.Customers;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class XMLparserSAX {
    private final static Logger LOGGER = LogManager.getLogger(XMLparserSAX.class);
    public static void main(String[] args) {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        try{
            SAXParser saxParser = saxParserFactory.newSAXParser();
            MyHandler handler = new MyHandler();
            saxParser.parse(new File(
                    "/Users/veriko/Desktop/practiseInSLV-master/src/main/resources/xml/customers.xml"
            ), handler);
            //get cust list
            List<Customers> custList = handler.getCustList();
            //print cust info
            for(Customers cust : custList){
                LOGGER.log(cust);
            }
        }catch(ParserConfigurationException | SAXException | IOException e){
            e.printStackTrace();
        }
    }
}
