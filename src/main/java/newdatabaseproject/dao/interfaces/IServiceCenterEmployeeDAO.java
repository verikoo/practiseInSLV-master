package newdatabaseproject.dao.interfaces;
import newdatabaseproject.models.ServiceCenter;

import java.util.List;
public interface IServiceCenterEmployeeDAO extends IBaseCommDAO<ServiceCenter>{
    List<ServiceCenter> getAllServiceCenter();
}
