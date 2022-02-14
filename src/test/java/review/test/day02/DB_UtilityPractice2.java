package review.test.day02;

import review.test.utility.DB_Utility;

public class DB_UtilityPractice2 {

    public static void main(String[] args) {

        DB_Utility.createConnection();

        DB_Utility.runQuery("select * from jobs");

        System.out.println("DB_Utility.getColumnCount() = " + DB_Utility.getColumnCount());

        System.out.println("DB_Utility.getRowCount() = " + DB_Utility.getRowCount());

        DB_Utility.displayAllData();

        DB_Utility.destroy();

    }
}
