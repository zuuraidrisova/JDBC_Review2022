package review.test.day03;

import review.test.utility.ConfigurationReader;
import review.test.utility.DB_Utility;

import java.util.List;
import java.util.Map;

public class SpartanPractice {

    public static void main(String[] args) {



        String url = ConfigurationReader.getProperty("sp.database.url");

        String username = ConfigurationReader.getProperty("sp.database.username");

        String password = ConfigurationReader.getProperty("sp.database.password");

        //create connection above credentials
        DB_Utility.createConnection(url, username, password);



        //     Run query "SELECT * FROM EMPLOYEES"

        DB_Utility.runQuery("select * from spartans");




        //    1. Display all data in console
        //  DB_Utility.displayAllData();





        //    2. Print column count

        int columnCount = DB_Utility.getColumnCount();

        System.out.println("columnCount = " + columnCount);




        //    2. Print row count

        int rowCount =  DB_Utility.getRowCount();

        System.out.println("rowCount = " + rowCount);




        //    5. Print out 2nd column data as a list

        List<String> list = DB_Utility.getEntireColumnDataAsList(2);

        System.out.println(list);





        //    5. Print out name column data as a list

        List<String> list2 = DB_Utility.getEntireColumnDataAsList("Name");

        System.out.println(list2);




        //    4. Print out 3rd row data as a list

        List<String> list3 = DB_Utility.getEntireRowDataAsList(3);

        System.out.println(list3);





        //    7, Print out 4th row as a Map

        Map<String, String> map = DB_Utility.getRowDataAsMap(4);

        System.out.println(map);







        //    8, Print out the data at row 5, column 1

        String str  = DB_Utility.getColumnDataAtRow(5,3);

        System.out.println(str);







        //    9, Print out the data at row 53, phone column

        String str2 = DB_Utility.getColumnDataAtRow(53, "phone");




        //close all resources
        DB_Utility.destroy();

    }
}
