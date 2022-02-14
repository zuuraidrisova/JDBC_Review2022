package review.test.day03;

import review.test.utility.DB_Utility;

public class HR_PracticeWithMap {

    public static void main(String[] args) {

        DB_Utility.createConnection();

        DB_Utility.runQuery("select * from locations");

        System.out.println("DB_Utility.getRowDataAsMap(6) = " + DB_Utility.getRowDataAsMap(6));

        System.out.println("DB_Utility.getDataAsListOfMap() = " + DB_Utility.getDataAsListOfMap());

        DB_Utility.destroy();

    }
}
