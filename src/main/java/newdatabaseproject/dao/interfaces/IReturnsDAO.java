package newdatabaseproject.dao.interfaces;
import newdatabaseproject.models.Returns;

import java.util.List;
public interface IReturnsDAO extends IBaseCommDAO<Returns> {
    List<Returns> getAllReturns();
}
