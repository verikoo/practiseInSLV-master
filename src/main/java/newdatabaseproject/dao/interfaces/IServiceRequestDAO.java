package newdatabaseproject.dao.interfaces;
import java.util.List;
import newdatabaseproject.models.ServiceRequest;

public interface IServiceRequestDAO extends IBaseCommDAO<ServiceRequest>{
    List<ServiceRequest> getALlServiceRequest();
}
