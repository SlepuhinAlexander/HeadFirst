package headfirst.chapter14.listings.l5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteAFile {
    public static void main(String[] args) {
        String path = System.getProperty("java.class.path") + "/";
        path += WriteAFile.class.getPackageName().replace('.','/') + "/WriteAFile.txt";
        try {
            FileWriter writer = new FileWriter(new File(path));
            writer.write("Hello world!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
