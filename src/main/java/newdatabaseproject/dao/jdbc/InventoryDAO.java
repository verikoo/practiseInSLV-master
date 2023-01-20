package newdatabaseproject.dao.jdbc;

import newdatabaseproject.dao.connectionpool.ConnectionPool;
import newdatabaseproject.dao.interfaces.IInventoryDAO;
import newdatabaseproject.models.Inventory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class InventoryDAO implements IInventoryDAO {
    private final static Logger LOGGER = LogManager.getLogger(InventoryDAO.class);

    @Override
    public Inventory getById(Long id) {
        Connection connection = ConnectionPool.getInstance().retrieve();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Inventory newInventory = new Inventory();
        try{
            preparedStatement = connection.prepareStatement("SELECT * FROM Inventory where id = ?");
            preparedStatement.setLong(1,id);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                newInventory.setId(resultSet.getLong("id"));
                newInventory.setQuantity(resultSet.getString("Quantity"));
                newInventory.setInventorycol(resultSet.getString("Inventorycol"));
            }
        }catch(SQLException e){
            LOGGER.error(e);
        }finally {
            try{
                assert resultSet != null;
                preparedStatement.close();
                resultSet.close();
            }catch(SQLException e){
                LOGGER.error(e);
            }
            ConnectionPool.getInstance().putback(connection);
        }
        return newInventory;
    }

    @Override
    public void insert(Inventory object) {
        Connection connection = ConnectionPool.getInstance().retrieve();
        PreparedStatement preparedStatement = null;

        try{
            preparedStatement= connection.prepareStatement("INSERT INTO Inventory(id, Quantity, Inventorycol) VALUES(?,?,?)");
            preparedStatement.setString(1,object.getQuantity());
            preparedStatement.setString(2,object.getInventorycol());
        }catch(SQLException e){
            LOGGER.error(e);
        }finally {
            try{
                assert preparedStatement !=null;
                preparedStatement.close();
            }catch(SQLException e){
                LOGGER.error(e);
            }
            ConnectionPool.getInstance().putback(connection);

        }

    }

    @Override
    public void update(Inventory object) {
        Connection connection = ConnectionPool.getInstance().retrieve();
        PreparedStatement preparedStatement = null;
        try{
            preparedStatement= connection.prepareStatement("UPDATE Customers SET Quantity =?, Inventorycol =? ");
            preparedStatement.setString(1,object.getQuantity());
            preparedStatement.setString(2,object.getInventorycol());
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
        PreparedStatement preparedStatement =  null;
        try{
            preparedStatement = connection.prepareStatement("DELETE FROM Inventory WHERE id = ?");
            preparedStatement.setLong(1,id);
            preparedStatement.executeUpdate();
        }catch(SQLException e){
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
    public List<Inventory> getAllInventory() {
        Connection connection = ConnectionPool.getInstance().retrieve();
        List<Inventory> inventoryList = new ArrayList<>();
        Statement statement = null;
        ResultSet resultSet = null;
        try{
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT FROM Inventory");
            while(resultSet.next()){
                Inventory inventory = new Inventory();
                inventory.setId(resultSet.getLong("id"));
                inventory.setQuantity(resultSet.getString("Quantity"));
                inventory.setInventorycol(resultSet.getString("Inventorycol"));
            }
        }catch(SQLException e){
            LOGGER.error(e);
        }finally {
            try{
                assert  statement != null;
                statement.close();
                assert resultSet !=null;
                resultSet.close();
            }catch(SQLException e){
                LOGGER.error(e);

            }
            ConnectionPool.getInstance().putback(connection);
        }
        return inventoryList;
    }
}
