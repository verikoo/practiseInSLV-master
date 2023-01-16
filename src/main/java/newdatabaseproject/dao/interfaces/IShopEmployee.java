package newdatabaseproject.dao.interfaces;
import java.util.List;
import newdatabaseproject.models.ShopEmployess;

public interface IShopEmployee extends IBaseCommDAO<ShopEmployess>{
    List<ShopEmployess> getAllShopEmployee();
}
