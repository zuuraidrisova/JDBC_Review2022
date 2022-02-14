package review.test.day01;

import review.test.utility.ConfigurationReader;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConnectionPractice {

    public static void main(String[] args) throws SQLException {

        String connectionURL = ConfigurationReader.getProperty("hr.database.url");

        String username = ConfigurationReader.getProperty("hr.database.username");

        String password = ConfigurationReader.getProperty("hr.database.password");

        Connection connection = DriverManager.getConnection(connectionURL, username, password);

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("select * from regions");

        List<String> regions = new ArrayList<>();

        while (resultSet.next()) {

            System.out.println("regions_name = " + resultSet.getString("region_name"));

            System.out.println("region_id = "+ resultSet.getString(1));

            regions.add(resultSet.getString("region_name"));

        }

        System.out.println("firstNames.size() = " + regions.size());


        resultSet.close();

        statement.close();

        connection.close();
    }
}
