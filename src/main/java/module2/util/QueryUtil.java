package module2.util;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class QueryUtil {

    public static ResultSet getResultSet(String query) throws SQLException, NullPointerException{
        PreparedStatement statement = ConnectionUtil.getConnection().prepareStatement(query);
        return statement.executeQuery();
    }

    public static ResultSet getResultSetWithParams(String query, Long param1) throws SQLException, NullPointerException{
        PreparedStatement statement = ConnectionUtil.getConnection().prepareStatement(query);
        statement.setLong(1, param1);
        return statement.executeQuery();
    }

    public static void executeQueryWithParams(String query, String param1) throws SQLException, NullPointerException{
        PreparedStatement statement = ConnectionUtil.getConnection().prepareStatement(query);
        statement.setString(1, param1);
        statement.executeUpdate();
        ConnectionUtil.getConnection().commit();
    }

    public static void executeQueryWithParams(String query, String param1, String param2) throws SQLException, NullPointerException {
        PreparedStatement statement = ConnectionUtil.getConnection().prepareStatement(query);
        statement.setString(1, param1);
        statement.setString(2, param2);
        statement.executeUpdate();
        ConnectionUtil.getConnection().commit();
    }
}
