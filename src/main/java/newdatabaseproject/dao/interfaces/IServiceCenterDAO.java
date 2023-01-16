package newdatabaseproject.dao.interfaces;
import newdatabaseproject.models.ServiceCenter;

import java.util.List;
public interface IServiceCenterDAO extends IBaseCommDAO<ServiceCenter> {
    List<ServiceCenter> getAllServiceCenter();
}
