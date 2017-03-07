package module2.dao.model;

import module2.model.Project;

import java.util.Collection;

public interface ProjectDAO extends GenericDAO<Project, Long, String> {
    void save(Project entity);

    void update(Project entity, String newParam);

    void delete(Project entity);

    Collection<Project> getAll();

    Project getById(Long aLong);
}
