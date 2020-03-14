package headfirst.chapter14.listings.l02;

import java.io.*;

public class Pond implements Serializable {
    private Duck duck = new Duck();

    public static void main(String[] args) {
        Pond myPond = new Pond();
        try {
            String path = System.getProperty("java.class.path") + "/";
            path += Pond.class.getPackageName().replace('.','/') + "/Pond.ser";
            FileOutputStream fs = new FileOutputStream(new File(path));
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(myPond);
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
