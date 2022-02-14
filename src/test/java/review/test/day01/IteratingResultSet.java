package review.test.day01;

import review.test.utility.ConfigurationReader;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class IteratingResultSet {


    public static void main(String[] args) throws SQLException {

        String connectionURL = ConfigurationReader.getProperty("hr.database.url");

        String username = ConfigurationReader.getProperty("hr.database.username");

        String password = ConfigurationReader.getProperty("hr.database.password");

        Connection connection = DriverManager.getConnection(connectionURL, username, password);

        Statement state = connection.createStatement();

        ResultSet resultSet = state.executeQuery("select * from jobs");

        List<String> job_id = new ArrayList<>();

        List<String> job_Title = new ArrayList<>();

        List<String> managerId = new ArrayList<>();

        while (resultSet.next()) {

            System.out.println(resultSet.getString(1));

            job_id.add(resultSet.getString(1));

            System.out.println(resultSet.getString(2));

            job_Title.add(resultSet.getString(2));

            System.out.println(resultSet.getString(3));

            managerId.add(resultSet.getString(3));

        }

        System.out.println(job_id.size());

        System.out.println(job_Title.size());

        System.out.println(managerId.size());

        System.out.println(job_id);

        System.out.println(job_Title);

        System.out.println(managerId);

        resultSet.close();

        state.close();

        connection.close();

    }

}
