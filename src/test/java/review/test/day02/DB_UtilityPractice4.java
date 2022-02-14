package review.test.day02;

import review.test.utility.DB_Utility;

import java.util.Map;

public class DB_UtilityPractice4 {

    public static void main(String[] args) {

        DB_Utility.createConnection();

        DB_Utility.runQuery("select * from regions");

        Map<String, String> map = DB_Utility.getRowDataAsMap(2);

        System.out.println(map);

        DB_Utility.destroy();

    }
}
