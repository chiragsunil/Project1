package day41;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.Objects;
import java.util.Properties;
import java.util.Set;

public class ReadingConfigPropertiesFile {
    public static void main(String[] args) throws IOException {

        //location of properties file
        FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"//testData//config_properties");

        //loading properties file
        Properties propertiesobj = new Properties();
        propertiesobj.load(file);

        //Reading data properties  file
        String url = propertiesobj.getProperty("appurl");
        String email = propertiesobj.getProperty("email");
        String pwd = propertiesobj.getProperty("passwordw");
        String orid = propertiesobj.getProperty("orderid");
        String cusid = propertiesobj.getProperty("customerid");

        System.out.println(url+" "+email+" "+pwd+" "+orid+" "+cusid);

        //1) Approach Reading all the key from properties file
        //Set <String> keys =propertiesobj.stringPropertyNames();
        //System.out.println(keys);

        //2) Approach
        Set<Object> keys = propertiesobj.keySet();
        System.out.println(keys);

        //Reading all the values from the properties file
        Collection<Object> values = propertiesobj.values();
        System.out.println(values);

        file.close();


    }
}
