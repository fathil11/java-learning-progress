import java.util.ArrayList;

public class Album {
    private String name;
    private ArrayList<Song> songs;

    // Constructor Section
    public Album(String name) {
        this.name = name;
        this.songs = new ArrayList<Song>();
    }

    public static Album createAlbum(String name) {
        return new Album(name);
    }

    // Main Section
    public boolean addSong(String title, int duration) {
        if (querySong(title) == null) {
            songs.add(Song.createSong(title, duration));
            return true;
        }
        System.out.println("Song already exists");
        return false;
    }

    // Query Section
    public Song querySong(String title) {
        for (int i = 0; i < songs.size(); i++) {
            Song song = getSong(i);
            if (song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }

    // Getter Section
    public String getName() {
        return name;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public Song getSong(int position) {
        return songs.get(position);
    }

}
