package review.test.day01;

import review.test.utility.ConfigurationReader;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MetaData__ {


    public static void main(String[] args) throws SQLException {

        String connectionURL = ConfigurationReader.getProperty("hr.database.url");

        String username = ConfigurationReader.getProperty("hr.database.username");

        String password = ConfigurationReader.getProperty("hr.database.password");

        Connection connection = DriverManager.getConnection(connectionURL, username, password);

        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

        ResultSet resultSet = statement.executeQuery("select * from locations");

        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();

        System.out.println("resultSetMetaData.getColumnCount() = " + resultSetMetaData.getColumnCount());

        System.out.println("resultSetMetaData.getColumnName(1) = " + resultSetMetaData.getColumnName(1));

        System.out.println("=========================");

      //  int columnCount = resultSetMetaData.getColumnCount();

        for (int i = 1; i < resultSetMetaData.getColumnCount(); i++){

            System.out.println("getColumnName = " + resultSetMetaData.getColumnName(i));

        }

        System.out.println("=========================");

        resultSet = statement.executeQuery("select * from employees");

        resultSetMetaData = resultSet.getMetaData();

        int columnCount = resultSetMetaData.getColumnCount();

        System.out.println("columnCount = " + columnCount);

        String secondColumnName = resultSetMetaData.getColumnName(2);

        System.out.println("secondColumnName = " + secondColumnName);

        System.out.println("=========================");

        List<String> columnNames = new ArrayList<>();

        for (int i = 1; i < resultSetMetaData.getColumnCount(); i++){

            System.out.println("column name: "+resultSetMetaData.getColumnName(i));

            columnNames.add(resultSetMetaData.getColumnName(i));

        }

        System.out.println("columnNames.size() = " + columnNames.size());

        System.out.println("columnNames = " + columnNames);

        resultSet.close();

        statement.close();

        connection.close();

    }
}
