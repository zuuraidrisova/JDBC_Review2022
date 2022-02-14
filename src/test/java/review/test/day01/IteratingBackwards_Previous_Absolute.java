package review.test.day01;

import review.test.utility.ConfigurationReader;

import java.sql.*;

public class IteratingBackwards_Previous_Absolute{

    public static void main(String[] args) throws SQLException {

        String connectionURL = ConfigurationReader.getProperty("hr.database.url");

        String username = ConfigurationReader.getProperty("hr.database.username");

        String password = ConfigurationReader.getProperty("hr.database.password");

        Connection connection = DriverManager.getConnection(connectionURL, username, password);

        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

        ResultSet resultSet = statement.executeQuery("select * from locations");

        resultSet.next();

        System.out.println("resultSet.getString(1) = " + resultSet.getString("city"));

        resultSet.next();

        System.out.println("resultSet.getString(3) = " + resultSet.getString("city"));

        resultSet.previous();

        System.out.println("resultSet.getString(3) = " + resultSet.getString("city"));

        resultSet.absolute(7);//to move to any row u want

        System.out.println("resultSet.getString(3) = " + resultSet.getString("city"));

        resultSet.first();

        System.out.println("resultSet.getString(3) = " + resultSet.getString("city"));

        resultSet.last();

        System.out.println("resultSet.getString(3) = " + resultSet.getString("city"));

        resultSet.previous();

        System.out.println(resultSet.getString("city"));

        resultSet.close();

        statement.close();

        connection.close();

    }
}
