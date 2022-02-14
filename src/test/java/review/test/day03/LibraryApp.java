package review.test.day03;

import review.test.utility.DB_Utility;

public class LibraryApp {

    public static void main(String[] args) {

        String url = "jdbc:mysql://18.233.97.71:3306/library1";
        String username = "library1_client" ;
        String password = "WVF4NdGXCKHeE6VQ" ;

        DB_Utility.createConnection(url, username, password);

        DB_Utility.runQuery("select * from books");

        DB_Utility.displayAllData();

        DB_Utility.destroy();

    }
}
