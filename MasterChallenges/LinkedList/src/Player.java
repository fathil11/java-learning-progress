import java.util.ArrayList;
import java.util.LinkedList;

public class Player {
    private ArrayList<Album> albums;
    private LinkedList<Song> playlist;
    private boolean moveForward;

    // Constructor Section
    public Player() {
        this.albums = new ArrayList<Album>();
        this.playlist = new LinkedList<Song>();
        this.moveForward = false;
    }

    // Main Section
    public boolean addAlbum(String name){
        if(queryAlbum(name) == null){
            albums.add(Album.createAlbum(name));
            return true;
        }
        return false;
    }

    public boolean addSongToPlaylist(String albumName, String songName){
        Album album = queryAlbum(albumName);
        if(album != null){
            Song song = album.querySong(songName);
            if(song != null){
                playlist.add(song);
                return true;
            }
            System.out.println("Song with title -> " + songName + "doesn't exists");
            return false;
        }
        System.out.println("Album doesn't exists");
        return false;
    }

    // Query Section
    public Album queryAlbum(String name){
        for (int i = 0; i < albums.size(); i++){
            Album album = getAlbum(i);
            if(album.getName().equals(name)){
                return album;
            }
        }
        return null;
    }

    // Getter Section
    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public Album getAlbum(int position){
        return albums.get(position);
    }

    public LinkedList<Song> getPlaylist() {
        return playlist;
    }

    public boolean isMoveForward() {
        return moveForward;
    }

    public void setMoveForward(boolean moveForward) {
        this.moveForward = moveForward;
    }
}
