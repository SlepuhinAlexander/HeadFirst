package headfirst.chapter16.listings.l3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Jukebox5 {

    private static final String PATH = System.getProperty("java.class.path") + "/" +
            Jukebox5.class.getPackageName().replace('.', '/') + "/SongListMore.txt";

    private ArrayList<Song> songList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(PATH);
        new Jukebox5().go();
    }

    public void go() {
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
        Collections.sort(songList, new ArtistCompare());
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
        songList.add(new Song(tokens[0], tokens[1], tokens[2], tokens[3]));
    }

    class ArtistCompare implements Comparator<Song> {
        @Override
        public int compare(Song one, Song two) {
            return one.getArtist().compareTo(two.getArtist());
        }
    }

}
