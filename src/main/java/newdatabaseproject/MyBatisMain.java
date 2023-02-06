package newdatabaseproject;

import newdatabaseproject.dao.mybatis.*;
import newdatabaseproject.models.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyBatisMain {
    private static final Logger LOGGER = LogManager.getLogger(MyBatisMain.class);

    public static void main(String[] args) {
// ------start ------Customer
//        CustomersDAO customersDAO = new CustomersDAO();

////        insert
//        Customers customers = new Customers(6L,"Lilia", "Guramishvili", "8--33-33", "guramishvili@example.com", " guramishvili str 1", "no hist");
//        customersDAO.insert(customers);

//        select all
//        for(Customers customers1: customersDAO.getAllCustomers()){
//            LOGGER.info(customers1);
//        }
//        update
//        Customers customers = new Customers(4L, "Ilia", "Didostati", "1-20-32", "updated@email.com", "updated address", "will updated");
//        customersDAO.update(customers, 4L);

//        delete
//        customersDAO.delete(4L);

//        get by
//        Customers customers1=  customersDAO.getById(3L);
//        LOGGER.info(customers1);
// ------end ------Customer

// ------START -----DELIVERIES
        DeliveriesDAO deliveriesDAO = new DeliveriesDAO();
//        INSERT
//        Deliveries deliveries1 = new Deliveries(5L, "Pirosmani str 11", "on way", "1200$", "Done");
//        deliveriesDAO.insert(deliveries1);

//        GETBY
//        Deliveries deliveries = deliveriesDAO.getById(5L);
//        LOGGER.info(deliveries);
//        SELECT ALL
//        for(Deliveries deliveries : deliveriesDAO.getAllDeliveries()){
//            LOGGER.info(deliveries);
//        }
//        UPDATE
// ------END -----DELIVERIES
    }
}
