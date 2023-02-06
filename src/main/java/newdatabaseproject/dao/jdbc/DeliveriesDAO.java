package newdatabaseproject.dao.jdbc;

import newdatabaseproject.dao.connectionpool.ConnectionPool;
import newdatabaseproject.dao.interfaces.IDeliveriesDAO;
import newdatabaseproject.models.Deliveries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DeliveriesDAO extends MySqlDao implements IDeliveriesDAO {
    private final static Logger LOGGER = LogManager.getLogger(DeliveriesDAO.class);


    @Override
    public Deliveries getById(Long id) {
        Connection connection = ConnectionPool.getInstance().retrieve();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Deliveries newDeliveries = new Deliveries();
        try{
            preparedStatement = connection.prepareStatement("SELECT * FROM Deliveries WHERE id = ?");
            preparedStatement.setLong(1,id);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                newDeliveries.setId(resultSet.getLong("id"));
                newDeliveries.setDeliveryAddress(resultSet.getString("Delivery_Address"));
                newDeliveries.setDeliveryStatus(resultSet.getString("Delivery_Status"));
                newDeliveries.setPurchaseCost(resultSet.getString("Purchase_Cost"));
                newDeliveries.setPurchaseStatus(resultSet.getString("Purchase_Status"));
            }
        }catch(SQLException e){
            LOGGER.error(e);
        }finally{
            try{
                assert resultSet != null;
                preparedStatement.close();
                resultSet.close();
            }catch (SQLException e){
                LOGGER.error(e);
            }
            ConnectionPool.getInstance().putback(connection);
        }
        return newDeliveries;
    }

    @Override
    public void insert(Deliveries object) {
        Connection connection = ConnectionPool.getInstance().retrieve();
        PreparedStatement preparedStatement = null;
        try{
            preparedStatement = connection.prepareStatement("INSERT INTO Deliveries(id, Delivery_Address, Delivery_Status,Purchase_Cost, Purchase_Status)VALUES(?,?,?,?,?)");
            preparedStatement.setLong(1,object.getId());
            preparedStatement.setString(2,object.getDeliveryAddress());
            preparedStatement.setString(3,object.getDeliveryStatus());
            preparedStatement.setString(4, object.getPurchaseCost());
            preparedStatement.setString(5, object.getPurchaseStatus());
            preparedStatement.executeUpdate();
            LOGGER.info("inserted successfully");
        }catch (SQLException e){
            LOGGER.error(e);
        }finally {
            try{
                assert preparedStatement != null;
                preparedStatement.close();
            }catch (SQLException e){
                LOGGER.error(e);
            }
            ConnectionPool.getInstance().putback(connection);
        }

    }

    @Override
    public void update(Deliveries object) {
    Connection connection =  ConnectionPool.getInstance().retrieve();
    PreparedStatement preparedStatement = null;
    try{
        preparedStatement = connection.prepareStatement("UPDATE Deliveries SET Delivery_Address=?, Delivery_Status=?, Purchase_Cost=?, Purchase_Status=? ");
        preparedStatement.setString(1, object.getDeliveryAddress());
        preparedStatement.setString(2, object.getDeliveryStatus());
        preparedStatement.setString(3,object.getPurchaseCost());
        preparedStatement.setString(4, object.getPurchaseStatus());
        preparedStatement.executeUpdate();
        LOGGER.info("Updated Successfully");
    }catch(SQLException e){
        LOGGER.error(e);
    }finally {
        try{
            assert preparedStatement != null;
            preparedStatement.close();

        }catch(SQLException e){
            LOGGER.error(e);
        }
    }
    }

    @Override
    public void delete(Long id) {
        Connection connection = ConnectionPool.getInstance().retrieve();
        PreparedStatement preparedStatement = null;
        try{
            preparedStatement = connection.prepareStatement("DELETE FROM Deliveries WHERE id = ?");
            preparedStatement.setLong(1,id);
            preparedStatement.executeUpdate();

            LOGGER.info("Deleted successfully");
        }catch(SQLException e){
            LOGGER.error(e);
        }finally {
            try{
                assert  preparedStatement != null;
                preparedStatement.close();

            }catch(SQLException e){
                LOGGER.error(e);
            }
            ConnectionPool.getInstance().putback(connection);

        }

    }

    @Override
    public List<Deliveries> getAllDeliveries() {
        Connection connection = ConnectionPool.getInstance().retrieve();
        List<Deliveries> deliveriesList = new ArrayList<>();
        Statement statement = null;
        ResultSet resultSet = null;
        try{
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM Deliveries");
            while(resultSet.next()){
                Deliveries deliveries = new Deliveries();

                deliveries.setId(resultSet.getLong("id"));
                deliveries.setDeliveryAddress(resultSet.getString("Delivery_Address"));
                deliveries.setDeliveryStatus(resultSet.getString("Delivery_Status"));
                deliveries.setPurchaseCost(resultSet.getString("Purchase_Cost"));
                deliveries.setPurchaseStatus(resultSet.getString("Purchase_Status"));

                deliveriesList.add(deliveries);
            }
        }catch(SQLException e){
            LOGGER.error(e);
        }finally {
            try{
                assert statement != null;
                statement.close();
                assert resultSet != null;
                resultSet.close();
            }catch(SQLException e){
                LOGGER.error(e);
            }
            ConnectionPool.getInstance().putback(connection);
        }
        return deliveriesList;
    }
}
