package module2.dao.model;

import module2.model.Developer;

import java.util.Collection;

public interface DeveloperDAO extends GenericDAO<Developer, Long, String> {
    void save(Developer entity);

    void update(Developer entity, String newParam);

    void delete(Developer entity);

    Collection<Developer> getAll();

    Developer getById(Long aLong);
}
