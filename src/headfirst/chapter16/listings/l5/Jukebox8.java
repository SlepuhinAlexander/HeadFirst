package headfirst.chapter16.listings.l5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Jukebox8 {
    private static final String PATH = System.getProperty("java.class.path") + "/" +
            Jukebox8.class.getPackageName().replace('.', '/') + "/SongListMore.txt";

    private ArrayList<Song> songList = new ArrayList<>();

    public static void main(String[] args) {
        new Jukebox8().go();
    }

    public void go() {
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
        TreeSet<Song> songSet = new TreeSet<>(songList);
        System.out.println(songSet);
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
        songList.add(new Song(tokens[0], tokens[1], tokens[2], tokens[3]));
    }
}
