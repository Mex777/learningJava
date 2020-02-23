package LinkedLists;

import java.util.ArrayList;
import java.util.Iterator;

public class Album {
    private String name;
    private ArrayList<Song> songs;

    public Album(String name) {
        this.name = name;
        songs = new ArrayList<Song>();
    }
    public void addSong(String name, int duration) {
        songs.add(new Song(name, duration));
    }
    public void showSongs() {
        if (!songs.isEmpty()) {
            System.out.println("The album has:");
            for (int i = 0; i < songs.size(); i++) {
                System.out.println((i+1) + "." + songs.get(i).getTitle());
            }
        } else {
            System.out.println("No songs added.");
        }
    }
}
