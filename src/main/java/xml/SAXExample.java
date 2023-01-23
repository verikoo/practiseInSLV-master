package xml;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class SAXExample {
    private final static Logger LOGGER = LogManager.getLogger(SAXExample.class);

    public static void main(String[] args) {
        DefaultHandler defaultHandler = new DefaultHandler(){
            boolean name = false;
            boolean surname = false;
            boolean contactNumber = false;
            boolean email = false;
            boolean address = false;
            boolean purchaseHistory = false;

            @Override
            public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException{
                LOGGER.info("Start Element"+qName);
                if(qName.equals("Name")) name=true;
                if(qName.equals("Surname")) surname=true;
                if(qName.equals("Email")) email=true;
                if(qName.equals("Purchase_History")) purchaseHistory =true;
            }

            @Override
            public void endElement(String uri, String localName, String qName) throws SAXException{
               LOGGER.info("End element " + qName);
            }

            public void characters(char[] ch, int start, int length) throws SAXException{
                if(name){
                    LOGGER.info("Name: "+ new String(ch, start, length));
                    name = false;
                }
                if(surname){
                    LOGGER.info("Surname " + new String(ch,start,length));
                    surname = false;
                }
                if(email){
                    LOGGER.info("Email :"+ new String(ch,start,length));
                    email =false;
                }
                if(purchaseHistory){
                    LOGGER.info("Purchase_History " + new String(ch,start,length));
                    purchaseHistory =  false;
                }
            }

        };

        SAXParserFactory saxParser = SAXParserFactory.newInstance();
                try{
                    SAXParser parserSX = saxParser.newSAXParser();
                    parserSX.parse(new File("src/main/resources/xml/customers.xml"), defaultHandler);

                }catch(ParserConfigurationException | SAXException | IOException ex){
                    LOGGER.error(ex);
                }
    }
}
