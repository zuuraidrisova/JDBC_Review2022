package review.test.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties = new Properties();


    static {

        String path = "configuration.properties";

        try{

            FileInputStream file = new FileInputStream(path);

            properties.load(file);

            file.close();

        }catch (IOException e){

            e.getMessage();
            e.printStackTrace();;

        }
    }


    public static String getProperty(String keyWord){

        return  properties.getProperty(keyWord);
    }

}
