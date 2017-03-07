package module2.model;

import java.util.List;

public class Company extends NamedEntity{
    public Company(Long id, String name) {
        super(id, name);
    }

    public boolean isUnique(List<Company> companies, Company company) {
        for (Company c : companies) {
            if (company.getName().equalsIgnoreCase(c.getName())) {
                return false;
            }
        }
        return true;
    }
}
