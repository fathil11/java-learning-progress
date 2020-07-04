import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static Player player;
    private static ListIterator<Song> playlistIterator;
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        initPlayer();
        playlistIterator = player.getPlaylist().listIterator();

        boolean exit = false;
        printMenu();
        while (!exit) {
            printCurrentPlayingSong();
            System.out.print("\nChose action : ");
            int option = scanner.nextInt();
            scanner.nextLine();
            System.out.println();
            switch (option) {
                case 1:
                    playNextSong();
                    break;
                case 2:
                    playPreviousSong();
                    break;
                case 3:
                    removeCurrentSong();
                    break;
                case 4:
                    printPlaylistSongs();
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    exit = true;
            }
        }
    }

    public static void playNextSong() {
        Song song;
        if (!player.isMoveForward()) {
            if (nextIterator()) {
                nextIterator();
            }
        } else {
            nextIterator();
        }
        player.setMoveForward(true);
    }

    public static void playPreviousSong() {
        Song song;
        if (!player.isMoveForward()) {
            previousIterator();
        } else {
            if (previousIterator()) {
                previousIterator();
            }
        }
        player.setMoveForward(false);
    }

    public static void removeCurrentSong() {
        Song song;
        if (!player.isMoveForward()) {
            playlistIterator.next();
            player.setMoveForward(true);
        } else {
            playlistIterator.previous();
            player.setMoveForward(false);
        }
        playlistIterator.remove();
    }

    public static void printPlaylistSongs(){
        Iterator<Song> i = player.getPlaylist().iterator();
        while(i.hasNext()){
            Song song = i.next();
            System.out.println(song.getTitle() + " (" + song.getDuration() + ")");
        }
    }

    public static void printMenu() {
        System.out.println("Action List :");
        System.out.println("1. Play Next Song");
        System.out.println("2. Play Previous Song");
        System.out.println("3. Remove current Song from Playlist");
        System.out.println("4. Print Song in Playlist");
        System.out.println("5. Print Action");
        System.out.println("6. Exit");
    }

    public static void printCurrentPlayingSong() {
        Song song;
        if (!player.isMoveForward()) {
            song = playlistIterator.next();
            player.setMoveForward(true);
        } else {
            song = playlistIterator.previous();
            player.setMoveForward(false);
        }
        System.out.println("*- Now playing : " + song.getTitle() +
                " (" + song.getDuration() + " minutes) -*");
    }

    public static void initPlayer() {
        player = new Player();
        Album album;
        String albumName;

        albumName = "Jazz";
        player.addAlbum(albumName);
        album = player.queryAlbum(albumName);
        album.addSong("Fly Me to the Moon", 2);
        album.addSong("Charles Whisper", 3);
        album.addSong("Menghujam Jantungku", 3);
        album.addSong("Belahan Jiwa", 4);

        albumName = "Rock";
        player.addAlbum(albumName);
        album = player.queryAlbum(albumName);
        album.addSong("Dead lift", 2);
        album.addSong("Unholy Confession", 3);
        album.addSong("Single F*ck that", 3);

        albumName = "Pop";
        player.addAlbum(albumName);
        album = player.queryAlbum(albumName);
        album.addSong("Kasih Putih", 4);
        album.addSong("Semakin", 3);

        player.addSongToPlaylist("Jazz", "Fly Me to the Moon");
        player.addSongToPlaylist("Rock", "Unholy Confession");
        player.addSongToPlaylist("Pop", "Kasih Putih");
        player.addSongToPlaylist("Rock", "Dead lift");
        player.addSongToPlaylist("Jazz", "Menghujam Jantungku");
    }

    public static boolean nextIterator() {
        if (playlistIterator.hasNext()) {
            playlistIterator.next();
            return true;
        }
        System.out.println("The song doesn't have any next song");
        player.setMoveForward(true);
        return false;
    }

    public static boolean previousIterator() {
        if (playlistIterator.hasPrevious()) {
            playlistIterator.previous();
            return true;
        }
        System.out.println("The song doesn't have any previous song");
        player.setMoveForward(false);
        return false;
    }
}
