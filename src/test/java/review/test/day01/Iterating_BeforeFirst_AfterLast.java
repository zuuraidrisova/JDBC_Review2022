package review.test.day01;

import review.test.utility.ConfigurationReader;

import java.sql.*;

public class Iterating_BeforeFirst_AfterLast {

    public static void main(String[] args) throws SQLException {

        String connectionURL = ConfigurationReader.getProperty("hr.database.url");

        String username = ConfigurationReader.getProperty("hr.database.username");

        String password = ConfigurationReader.getProperty("hr.database.password");

        Connection connection = DriverManager.getConnection(connectionURL, username, password);

        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);

        ResultSet resultSet = statement.executeQuery("select * from locations");

        resultSet.afterLast();

        while (resultSet.previous()){

            System.out.println("city: " + resultSet.getString("city"));
        }

        System.out.println("==========================");

        resultSet.beforeFirst();

        while (resultSet.next()){

            System.out.println("city: " + resultSet.getString("city"));

        }

        System.out.println("==========================");

        resultSet.absolute(4);

        System.out.println("city: " + resultSet.getString("city"));


        System.out.println("==========================");

        resultSet.first();

        System.out.println("city: " + resultSet.getString("city"));


        System.out.println("==========================");

        resultSet.last();

        System.out.println("city: " + resultSet.getString("city"));

        System.out.println("==========================");

        int row = resultSet.getRow();

        System.out.println("row = " + row);

        resultSet.close();

        statement.close();

        connection.close();

    }
}
