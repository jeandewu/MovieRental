package JEAN.io;

import JEAN.CsvObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by RENT on 2017-05-22.
 */
public class DataFileWriter {

    public static void writeObjectToFile(String fileName, List<? extends CsvObject> dataList) {
        try {
            FileWriter fileWriter = new FileWriter(fileName);

            for (CsvObject csvObject : dataList) {
                fileWriter.write(csvObject.toCSVString() + System.lineSeparator());
            }

            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}