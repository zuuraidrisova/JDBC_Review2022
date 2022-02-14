package review.test.day02;

import review.test.utility.DB_Utility;

import java.util.List;

public class DB_UtilityPractice3 {

    public static void main(String[] args) {

        DB_Utility.createConnection();

        DB_Utility.runQuery("select * from employees");

        String s = DB_Utility.getColumnDataAtRow(2,2);

        System.out.println(s);

        String s2 = DB_Utility.getColumnDataAtRow(2, "last_name");

        System.out.println(s2);

        List<String> list = DB_Utility.getEntireRowDataAsList(4);

        System.out.println(list);

        List<String> list1 = DB_Utility.getEntireColumnDataAsList(6);

        System.out.println(list1);

        List<String> list2 =  DB_Utility.getEntireColumnDataAsList("last_name");

        System.out.println(list2);

        DB_Utility.destroy();

    }
}
