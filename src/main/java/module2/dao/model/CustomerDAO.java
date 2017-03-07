package module2.dao.model;

import module2.model.Customer;

import java.util.Collection;

public interface CustomerDAO extends GenericDAO<Customer, Long, String> {
    void save(Customer entity);

    void update(Customer entity, String newParam);

    void delete(Customer entity);

    Collection<Customer> getAll();

    Customer getById(Long aLong);
}
