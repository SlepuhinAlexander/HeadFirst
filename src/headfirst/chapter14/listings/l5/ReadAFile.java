package headfirst.chapter14.listings.l5;

import java.io.*;

public class ReadAFile {
    public static void main(String[] args) {
        String path = System.getProperty("java.class.path") + "/";
        path += WriteAFile.class.getPackageName().replace('.', '/') + "/WriteAFile.txt";
        try {
            File myFile = new File(path);
            FileReader fileReader = new FileReader(myFile);
            BufferedReader reader = new BufferedReader(fileReader);
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
