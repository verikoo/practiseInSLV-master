//package xml;
//
//import newdatabaseproject.models.Customers;
//import org.xml.sax.Attributes;
//import org.xml.sax.SAXException;
//import org.xml.sax.helpers.DefaultHandler;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class MyHandler extends DefaultHandler {
//
//    //    List to hold Employees object
//    private List<Customers> custList = null;
//    private Customers cust = null;
//    private StringBuilder data = null;
//
//    // getter method for customer list
//
//    public List<Customers> getCustList() {
//        return custList;
//    }
//
//    boolean bName = false;
//    boolean bSurname = false;
//    boolean bContactNumber = false;
//    boolean bEmail = false;
//    boolean bAddress = false;
//    boolean bPurchaseHistory = false;
//
//    @Override
//    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
//        if (qName.equalsIgnoreCase("Customers")) {
//            // create new employe and put it in Map
//            String id = attributes.getValue("id");
//            //initialize Customer object and set id attribute
//            cust = new Customers();
//            cust.setId((long) Integer.parseInt(id));
//
//            //initialize list
//            if (custList == null) {
//                custList = new ArrayList<>();
//            } else if (qName.equalsIgnoreCase("Name")) {
//                bName = true;
//            } else if (qName.equalsIgnoreCase("Surname")) {
//                bSurname = true;
//            } else if (qName.equalsIgnoreCase("Contact_Number")) {
//                bContactNumber = true;
//            } else if (qName.equalsIgnoreCase("Email")) {
//                bEmail = true;
//            } else if (qName.equalsIgnoreCase("Address")) {
//                bAddress = true;
//            } else if (qName.equalsIgnoreCase("Purchase_History")) {
//                bPurchaseHistory = true;
//            }
//            //create the data container
//            data = new StringBuilder();
//        }
//
//    }
//
////    switch case jaxb
//    @Override
//    public void endElement(String uri, String localName, String qName) throws SAXException{
//        if (bName){
//            //name element, set customer name
//            cust.setName(data.toString());
//            bName = false;
//        } else if (bSurname){
//            cust.setSurName(data.toString());
//            bSurname = false;
//        } else if (bContactNumber){
//            cust.setContactNumber(data.toString());
//            bContactNumber = false;
//        }else if(bEmail){
//            cust.setEmail(data.toString());
//            bEmail = false;
//        }else if(bAddress){
//            cust.setAddress(data.toString());
//            bAddress = false;
//        }else if(bPurchaseHistory){
//            cust.setPurchaseHistory(data.toString());
//            bPurchaseHistory = false;
//        }
//
//        if(qName.equalsIgnoreCase("Customers")){
//            //add cust object to list
//            custList.add(cust);
//        }
//    }
//    @Override
//    public void characters(char ch[], int start, int length) throws SAXException{
//        data.append(new String(ch, start, length)) ;
//    }
//}
