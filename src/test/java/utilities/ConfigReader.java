package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties;

    static {
        try {
            //даем путь к нашему файлу
            String path = "src/test/resources/configuration.properties";

            FileInputStream inputStream = new FileInputStream(path);
            properties = new Properties();
            properties.load(inputStream);
        }catch (IOException e){
            e.printStackTrace();

        }
    }

    public static String getProperty(String key){
        return properties.getProperty(key).trim();


    }
}

