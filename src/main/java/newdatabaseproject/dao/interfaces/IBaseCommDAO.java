package newdatabaseproject.dao.interfaces;

public interface IBaseCommDAO<T> {
    T getById(Long id);
    void insert(T object);
    void update(T object);
    void delete(Long id);
}
