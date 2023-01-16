package newdatabaseproject.dao.interfaces;
import newdatabaseproject.models.Shop;

import java.util.List;
public interface IShopDAO extends IBaseCommDAO<Shop> {
    List<Shop> getAllShop();
}
