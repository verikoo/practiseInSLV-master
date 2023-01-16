package newdatabaseproject.dao.interfaces;
import newdatabaseproject.models.PhonesDetails;

import java.util.List;
public interface IPhonesDetailsDAO extends IBaseCommDAO<PhonesDetails>{
    List<PhonesDetails> getAllPhonesDetails();
}
