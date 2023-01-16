package newdatabaseproject.dao.interfaces;
import newdatabaseproject.models.Purchases;

import java.util.List;
public interface IPurchasesDAO extends IBaseCommDAO<Purchases>{
    List<Purchases> getAllPurchase();
}
