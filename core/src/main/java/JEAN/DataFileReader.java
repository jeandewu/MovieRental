package JEAN;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

/**
 * Created by RENT on 2017-05-22.
 */
public class DataFileReader {
    public static List<Customer> readCustomersFromFile(String fileName){
        try {
            String line
            Customer customer = new Customer(line);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        return null;
    }
}