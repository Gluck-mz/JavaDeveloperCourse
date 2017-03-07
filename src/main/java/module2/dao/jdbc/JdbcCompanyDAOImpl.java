package module2.dao.jdbc;

import module2.dao.model.CompanyDAO;
import module2.model.Company;
import module2.util.ConnectionUtil;
import module2.util.QueryUtil;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JdbcCompanyDAOImpl extends ConnectionUtil implements CompanyDAO {
    private static final String ALL_FROM_COMPANIES = "SELECT * FROM COMPANIES";
    private static final String INSERT_INTO_COMPANIES = "INSERT INTO COMPANIES (COMPANY_NAME) VALUES (?)";
    private static final String UPDATE_COMPANIES = "UPDATE COMPANIES SET COMPANY_NAME = (?) WHERE COMPANY_NAME = (?)";
    private static final String DELETE_FROM_COMPANIES = "DELETE FROM COMPANIES WHERE COMPANY_NAME = (?)";
    private static final String GET_COMPANY_BY_ID = "SELECT * FROM COMPANIES WHERE COMPANY_ID = (?)";

    public void save(Company company) {
        if (!company.isUnique(getAll(), company)) {
            System.err.println("\nSuch company already exists!");
        } else {
            try {
                QueryUtil.executeQueryWithParams(INSERT_INTO_COMPANIES, company.getName());
            } catch (SQLException e) {
                throw new RuntimeException("Cannot execute query", e);
            }
        }
    }

    public void update(Company company, String newParam) {
        if (company.isUnique(getAll(), company)) {
            System.err.println("\nSuch company does not exist!");
        } else {
            try {
                QueryUtil.executeQueryWithParams(UPDATE_COMPANIES, newParam, company.getName());
            } catch (SQLException e) {
                throw new RuntimeException("Cannot execute query", e);
            }
        }
    }

    public void delete(Company company) {
        if (company.isUnique(getAll(), company)) {
            System.err.println("Such company does not exist!\n");
        } else {
            try {
                QueryUtil.executeQueryWithParams(DELETE_FROM_COMPANIES, company.getName());
            } catch (SQLException e) {
                throw new RuntimeException("Cannot execute query", e);
            }
        }
    }

    public List<Company> getAll() {
        List<Company> result = new ArrayList<>();
        try {
            ResultSet resultSet = QueryUtil.getResultSet(ALL_FROM_COMPANIES);
            while (resultSet.next()) {
                Company company = new Company(resultSet.getLong("COMPANY_ID"), resultSet.getString("COMPANY_NAME"));
                result.add(company);
            }
        } catch (SQLException|NullPointerException e) {
            throw new RuntimeException("Cannot execute query", e);
        }
        return result;
    }

    public Company getById(Long aLong) {
        try {
            ResultSet resultSet = QueryUtil.getResultSetWithParams(GET_COMPANY_BY_ID, aLong);
            if (resultSet != null) {
                while (resultSet.next()) {
                    return new Company(resultSet.getLong("COMPANY_ID"), resultSet.getString("COMPANY_NAME"));
                }
            } else {
                System.err.println("\nCompany with ID = " + aLong + " does not exist");
            }
        } catch (SQLException e) {
            throw new RuntimeException("Cannot execute query", e);
        }
        return null;
    }
}
