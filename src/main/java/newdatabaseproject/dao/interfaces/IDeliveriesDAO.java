package newdatabaseproject.dao.interfaces;

import newdatabaseproject.models.Deliveries;

import java.util.List;

public interface IDeliveriesDAO extends  IBaseCommDAO<Deliveries>{
    List<Deliveries> getAllDeliveries() ;
}
