package newdatabaseproject;

import newdatabaseproject.dao.jdbc.CustomersDAO;
import newdatabaseproject.dao.jdbc.DeliveriesDAO;
import newdatabaseproject.dao.jdbc.InventoryDAO;
import newdatabaseproject.models.Customers;
import newdatabaseproject.models.Deliveries;
import newdatabaseproject.models.Inventory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class JDBCMain {

 private static final Logger LOGGER = LogManager.getLogger(JDBCMain.class);
 public static void main(String[] args) {
////------Start----------Customers
  CustomersDAO customersDAO = new CustomersDAO();
//  //  Select
//  Customers testCust = customersDAO.getById(1L);
//  LOGGER.info(testCust);

//  // INSERT
//  Customers customers1= new Customers(2L, "Ilia", "Chavchavadze", "8-1837", "chavchavadze@ena.com", "Ilia chavchavadze str 1", "no hist");
//  Customers customers2= new Customers(3L, "Vaxtang", "Gomelur", "55-55-5-5", "kikabidze@eample.com", "giorgi brtskinvale str 2", "no hist");
//  customersDAO.insert(customers1);
//  customersDAO.insert(customers2);
//
//
//
//  // REMOVE
//  customersDAO.delete(3L);
//
//  // UPDATE
//  Customers updateCustomer = new Customers(2L, "Ilia", "Didostati", "1-20-32", "updated@email.com", "updated address", "no hist");
//  customersDAO.update(updateCustomer);
//
//  //SELECT ALL
  for(Customers cust: customersDAO.getAllCustomers()){
   LOGGER.info(cust);
  }
////------End----------Customers


//------Start----------Deliveries

//  DeliveriesDAO deliveriesDAO = new DeliveriesDAO();

//  insert
//  Deliveries deliveries1 = new Deliveries(1L, "Pirosmani str 11", "on way", "1200$", "Done");
//  deliveriesDAO.insert(deliveries1);
//    Deliveries deliveries2 = new Deliveries(2L, "Pharnavazi  str 23", "preparing", "100Gel", "Done");
//    deliveriesDAO.insert(deliveries2);

//  select
//  for(Deliveries deliveries:deliveriesDAO.getAllDeliveries()){
//   LOGGER.info(deliveries);
//  }

//  Delete
//  deliveriesDAO.delete(2L);

//  getBy
//  Deliveries deliveries = deliveriesDAO.getById(1L);
//  LOGGER.info(deliveries);

//  update
//Deliveries updateDeliver1 = new Deliveries(1L, "Updated s pirsomani str1", "checking","200gel","Done");
//deliveriesDAO.update(updateDeliver1);
//------End------------Deliveries

//------Start------------Inventory
// InventoryDAO inventoryDAO = new InventoryDAO();
//  Insert
//  Inventory inventory1 = new Inventory(2L,"26","adapter");
//  inventoryDAO.insert(inventory1);
//  Select by
//  Inventory inventory = inventoryDAO.getById(2L);
//  LOGGER.info(inventory);
//  Delete
//inventoryDAO.delete(2L);
//  select all
//  for(Inventory invent: inventoryDAO.getAllInventory()){
//   LOGGER.info(invent);
//  }
//------End------------Inventory
 }
}
