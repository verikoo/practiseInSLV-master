package newdatabaseproject.dao.interfaces;

import newdatabaseproject.models.Inventory;

import java.util.List;

public interface IInventoryDAO extends  IBaseCommDAO<Inventory> {
    List<Inventory> getAllInventory();
}
