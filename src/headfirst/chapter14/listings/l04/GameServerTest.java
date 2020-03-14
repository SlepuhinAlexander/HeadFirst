package headfirst.chapter14.listings.l04;

import java.io.*;

public class GameServerTest {
    public static void main(String[] args) {
        String path = System.getProperty("java.class.path") + "/";
        path += GameCharacter.class.getPackageName().replace('.', '/') + "/Game.ser";
        GameCharacter one = new GameCharacter(50, "elf", new String[]{"bow", "sword", "knuckle"});
        GameCharacter two = new GameCharacter(200, "troll", new String[]{"bare hands", "broad axe"});
        GameCharacter three = new GameCharacter(120, "wizard", new String[]{"spells", "invisibility"});
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        one.power = (int) (one.power * Math.random());
        two.power = (int) (two.power * Math.random());
        three.power = (int) (three.power * Math.random());
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(new File(path)));
            os.writeObject(one);
            os.writeObject(two);
            os.writeObject(three);
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        one = null;
        two = null;
        three = null;
        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream(new File(path)));
            GameCharacter oneRestored = ((GameCharacter) is.readObject());
            GameCharacter twoRestored = ((GameCharacter) is.readObject());
            GameCharacter threeRestored = ((GameCharacter) is.readObject());
            is.close();
            System.out.println(one);
            System.out.println(two);
            System.out.println(three);
            System.out.println(oneRestored);
            System.out.println(twoRestored);
            System.out.println(threeRestored);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
