package module2.dao.model;

import module2.model.Company;

import java.util.Collection;

public interface CompanyDAO extends GenericDAO<Company, Long, String> {
    void save(Company entity);

    void update(Company entity, String newParam);

    void delete(Company entity);

    Collection<Company> getAll();

    Company getById(Long aLong);
}
