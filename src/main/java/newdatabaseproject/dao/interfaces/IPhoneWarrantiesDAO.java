package newdatabaseproject.dao.interfaces;
import newdatabaseproject.models.PhoneWarranties;

import java.util.List;
public interface IPhoneWarrantiesDAO extends IBaseCommDAO<PhoneWarranties> {
    List<PhoneWarranties> getAllPhoneWarranties();
}
