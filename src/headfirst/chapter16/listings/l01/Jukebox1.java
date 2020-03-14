package headfirst.chapter16.listings.l01;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Jukebox1 {
    public static final String PATH = System.getProperty("java.class.path") + "/" +
            Jukebox1.class.getPackageName().replace('.', '/') + "/SongList.txt";
    private ArrayList<String> songList = new ArrayList<>();

    public static void main(String[] args) {
        new Jukebox1().go();
    }

    public void go() {
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
    }

    void getSongs() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(PATH)));
            String line;
            while ((line = reader.readLine()) != null) {
                addSong(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void addSong(String lineToParse) {
        String[] tokens = lineToParse.split("/");
        songList.add(tokens[0]);
    }
}
