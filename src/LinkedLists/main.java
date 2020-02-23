package LinkedLists;

import java.util.*;

public class main {
    private static ArrayList <Album> albums = new ArrayList<Album>();
    private static LinkedList<Song> playlist = new LinkedList<Song>();
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        LinkedList<Song> playlist = new LinkedList<Song>();
        addSong("3 days", 2);
        addSong("Heaven it's a place on earth", 4);
        addSong("3 days", 2);
        menu();

    }
    public static void addSong(String name, int duration) {
        if (!hasSong(name, duration)) {
             playlist.add(new Song(name, duration));
            System.out.println("Song added:" + name);
        }
        else
            System.out.println("Song already exits in the playlist");
    }
    private static boolean hasSong(String name, int duration) {
        Song song = new Song (name, duration);
        Iterator it = playlist.iterator();
        while(it.hasNext()) {
            if (it.next().toString().equals(song.toString())) {
                return true;
            }
        }
    return false;
    }
    public static void menu() {
        ListIterator<Song> li = playlist.listIterator();
        if (playlist.isEmpty()) {
            System.out.println("Playlist is empty, you should add one");
        } else {
            System.out.println("Now playing " + li.next().toString());
        }
        boolean goingForward = true;
        boolean quit = false;
        System.out.println("Press:\n 0 - to exit\n 1 - to skip song\n 2 - to go to the previous song");
        while (!quit) {
            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 0:
                    System.out.println("PLaylist stopped");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward) {
                        if (li.hasNext()) {
                            li.next();
                        } else {
                            System.out.println("You've reached the end of the playlist");
                        }
                        goingForward = true;
                    }
                        if (li.hasNext())
                            System.out.println("Now playing: " + li.next().toString());
                        else
                            System.out.println("You've reached the end of the playlist");

                    break;
                case 2:
                    if (goingForward) {
                        if (li.hasPrevious()) {
                            li.previous();
                        }
                        else {
                            System.out.println("You are at the start of the playlist");
                        }
                        goingForward = false;
                    }
                    if (li.hasPrevious())
                        System.out.println("Now playing" + li.previous().toString());
                    else
                        System.out.println("You are at the start of the playlist");

                    break;
            }

        }
    }
}
