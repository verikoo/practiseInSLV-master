package newdatabaseproject;

import newdatabaseproject.dao.jdbc.CustomersDAO;
import newdatabaseproject.models.Customers;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class JDBCMain {

 private static final Logger LOGGER = LogManager.getLogger(JDBCMain.class);
 public static void main(String[] args) {
  CustomersDAO testCustomers = new CustomersDAO();

  Customers testCust = testCustomers.getById(1L);
  LOGGER.info(testCust);
 }
}
