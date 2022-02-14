package review.test.day02;

import review.test.utility.DB_Utility;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DB_UtilityPractice1 {

    public static void main(String[] args) throws SQLException {

        DB_Utility.createConnection();

        System.out.println("success");

        ResultSet resultSet = DB_Utility.runQuery("select * from locations");

        while (resultSet.next()){

            String city = resultSet.getString("city");

            System.out.println("city = " + city);
        }

        System.out.println("=============================");

        resultSet.absolute(7);

        System.out.println("city = " + resultSet.getString("city"));

        resultSet.previous();

        System.out.println("city = " + resultSet.getString("city"));

        int columnCount = DB_Utility.getColumnCount();

        System.out.println("columnCount = " + columnCount);

        int rowCount = DB_Utility.getRowCount();

        System.out.println("rowCount = " + rowCount);

        DB_Utility.destroy();

    }

}
