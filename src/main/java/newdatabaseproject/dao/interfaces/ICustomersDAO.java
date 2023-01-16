package newdatabaseproject.dao.interfaces;
import newdatabaseproject.models.Customers;
import java.util.List;

public interface ICustomersDAO extends IBaseCommDAO<Customers>{
    List<Customers> getAllCustomers() ;
}
