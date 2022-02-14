package review.test.day03;

import review.test.utility.DB_Utility;

public class SpartanPractice2 {

    public static void main(String[] args) {

        DB_Utility.createConnection("test");

        DB_Utility.runQuery("select * from spartans");

        DB_Utility.displayAllData();

        DB_Utility.destroy();

    }
}
