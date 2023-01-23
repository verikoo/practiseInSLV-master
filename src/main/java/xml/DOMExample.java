package xml;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class DOMExample {
    private static  final Logger LOGGER = LogManager.getLogger(DOMExample.class);

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
      try{
          DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
          DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
          Document doc =dBuilder.parse(new File("src/main/resources/xml/customers.xml"));
          doc.getDocumentElement().normalize();
          LOGGER.info("Root Element:" + doc.getDocumentElement().getNodeName());
          NodeList nList = doc.getElementsByTagName("Customer");
          LOGGER.info("______________");

          for(int i=0; i< nList.getLength(); i++){
              Node nNode = nList.item(i);
              LOGGER.info("\\nCurrent Element :"+ nNode.getNodeName());
              if(nNode.getNodeType()==Node.ELEMENT_NODE){
                  Element eElement= (Element) nNode;
                  LOGGER.info("Name :"+eElement.getElementsByTagName("Name").item(0).getTextContent());
                  LOGGER.info("Surname: "+ eElement.getElementsByTagName("Surname").item(0).getTextContent());
                  LOGGER.info("Email:" +eElement.getElementsByTagName("Email").item(0).getTextContent());
                  LOGGER.info("Purchase_History:"+ eElement.getElementsByTagName("Purchase_History").item(0).getTextContent());
              }


          }
      }catch (Exception e){
          LOGGER.error(e);
      }
    }
}
