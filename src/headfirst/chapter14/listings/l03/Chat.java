package headfirst.chapter14.listings.l03;

import java.io.*;

public class Chat implements Serializable {
    transient String currentID;
    String userName;

    public Chat() {
        currentID = "" + (int) (Math.random() * 1000000);
        userName = System.getProperty("user.name");
    }

    public static void main(String[] args) {
        Chat chat = new Chat();
        try {
            String path = System.getProperty("java.class.path") + "/";
            path += Chat.class.getPackageName().replace('.','/') + "/Char.ser";
            FileOutputStream fs = new FileOutputStream(path);
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(chat);
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
