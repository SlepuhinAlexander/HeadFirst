package headfirst.chapter14.listings.l1;

import java.io.*;

public class Box implements Serializable {
    private int width;
    private int height;

    public static void main(String[] args) {
        Box myBox = new Box();
        myBox.setWidth(50);
        myBox.setHeight(20);

        try {
            String path = System.getProperty("java.class.path") + "/";
            path += Box.class.getPackageName().replace('.', '/');
            path += "/Box.ser";
            FileOutputStream fs = new FileOutputStream(new File(path));
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(myBox);
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setWidth(int w) {
        width = w;
    }

    public void setHeight(int h) {
        height = h;
    }
}
