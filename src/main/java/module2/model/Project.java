package module2.model;

import java.util.Set;

public class Project extends NamedEntity {
    private Customer customer;
    private Company company;
    private Developer developer;

    public Project(Long id, String name, Customer customer, Company company, Developer developer) {
        super(id, name);
        this.customer = customer;
        this.company = company;
        this.developer = developer;
    }

    @Override
    public String toString() {
        return "Project{" +
                "customer=" + customer +
                ", company=" + company +
                ", developer=" + developer +
                '}';
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Developer getDeveloper() {
        return developer;
    }

    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }
}
