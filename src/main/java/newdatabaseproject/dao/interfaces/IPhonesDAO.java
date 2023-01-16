package newdatabaseproject.dao.interfaces;

import newdatabaseproject.models.Phones;

import java.util.List;

public interface IPhonesDAO extends IBaseCommDAO<Phones>{
    List<Phones> getAllPhones();
}
