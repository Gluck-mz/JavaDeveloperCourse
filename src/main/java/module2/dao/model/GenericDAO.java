package module2.dao.model;

import java.util.Collection;

public interface GenericDAO<T, ID, N> {
    void save(T entity);
    void update(T entity, N newParam);
    void delete(T entity);
    Collection<T> getAll();
    T getById(ID id);
}
