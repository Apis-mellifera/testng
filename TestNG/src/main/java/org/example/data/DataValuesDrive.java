package org.example.data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DataValuesDrive {

    public static void main(String[] args) throws IOException {

        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("C:\\framework\\TestNG\\src\\main\\resources\\data.properties");
        properties.load(fileInputStream);

        //retrieve value

        properties.getProperty("browser");

    }
}
