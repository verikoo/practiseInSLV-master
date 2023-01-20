package newdatabaseproject.dao.jdbc;

import newdatabaseproject.dao.connectionpool.ConnectionPool;
import newdatabaseproject.dao.interfaces.ICustomersDAO;
import newdatabaseproject.models.Customers;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomersDAO implements ICustomersDAO {
    private final static Logger LOGGER = LogManager.getLogger(CustomersDAO.class);

    @Override
    public Customers getById(Long id)  {
        Connection connection = ConnectionPool.getInstance().retrieve();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null ;
        Customers newCustomers = new Customers();
        try{
            preparedStatement = connection.prepareStatement("Select * from Customers where id = ?");
            preparedStatement.setLong(1,id);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                newCustomers.setId(resultSet.getLong("id"));
                newCustomers.setName(resultSet.getString("Name"));
                newCustomers.setSurName(resultSet.getString("Surname"));
                newCustomers.setContactNumber(resultSet.getString("Contact_Number"));
                newCustomers.setEmail(resultSet.getString("Email"));
                newCustomers.setAddress(resultSet.getString("Address"));
                newCustomers.setPurchaseHistory(resultSet.getString("Purchase_History"));
            }
        }catch (SQLException e){
            LOGGER.error(e);
        }finally {
            try {
                assert resultSet != null;
                preparedStatement.close();
                resultSet.close();
            } catch (SQLException e) {
               LOGGER.error(e);
            }
            ConnectionPool.getInstance().putback(connection);
        }
        return newCustomers;
    }

    @Override
    public void insert(Customers object) {
        Connection connection = ConnectionPool.getInstance().retrieve();
        PreparedStatement preparedStatement = null;
     try{
        preparedStatement = connection.prepareStatement("INSERT INTO Customers(id, Name, Surname, Contact_Number,Email, Address, Purchase_History) VALUES(?,?,?,?,?,?,?)");
        preparedStatement.setString(1, object.getName());
        preparedStatement.setString(2,object.getSurName());
        preparedStatement.setString(3,object.getContactNumber());
        preparedStatement.setString(4,object.getEmail());
        preparedStatement.setString(5,object.getPurchaseHistory());
    } catch (SQLException e){
        LOGGER.error(e);
    }finally{
        try{
            assert preparedStatement != null;
            preparedStatement.close();
        }catch(SQLException e){
            LOGGER.error(e);
        }
        ConnectionPool.getInstance().putback(connection);

    }}


    @Override
    public void update(Customers object) {
        Connection connection =ConnectionPool.getInstance().retrieve();
        PreparedStatement preparedStatement = null;
        try{
            preparedStatement = connection.prepareStatement("UPDATE Customers SET Name=?, Surname=?, Contact_Number=?, Email=?, Address=?, Purchase_History=?");
            preparedStatement.setString(1, object.getName());
            preparedStatement.setString(2,object.getSurName());
            preparedStatement.setString(3, object.getContactNumber());
            preparedStatement.setString(4, object.getEmail());
            preparedStatement.setString(5, object.getPurchaseHistory());
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
        Connection connection =  ConnectionPool.getInstance().retrieve();
        PreparedStatement preparedStatement = null;
        try{
            preparedStatement = connection.prepareStatement("DELETE FROM Customers WHERE id = ?");
            preparedStatement.setLong(1,id);
            preparedStatement.executeUpdate();

            LOGGER.info("Deleted successfully");
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
    public List<Customers> getAllCustomers() {
        Connection connection = ConnectionPool.getInstance().retrieve();
        List<Customers> customersList= new ArrayList<>();
        Statement statement = null;
        ResultSet resultSet = null;
        try{
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT FROM Customers");
            while(resultSet.next()){
                Customers customers =  new Customers();

                customers.setId(resultSet.getLong("id"));
                customers.setName(resultSet.getString("Name"));
                customers.setSurName(resultSet.getString("Surname"));
                customers.setContactNumber(resultSet.getString("Contact_Number"));
                customers.setEmail(resultSet.getString("Email"));
                customers.setAddress(resultSet.getString("Address"));
                customers.setPurchaseHistory(resultSet.getString("Purchase_History"));

                customersList.add(customers);
            }
        }catch(SQLException e){
            LOGGER.error(e);

        }finally {
            try {
                assert statement != null;
                statement.close();
                assert resultSet!= null;
                resultSet.close();
            }catch(SQLException e){
                LOGGER.error(e);
            }
            ConnectionPool.getInstance().putback(connection);
        }
        return customersList;
    }

}
