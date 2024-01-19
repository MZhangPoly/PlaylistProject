import java.util.ArrayList;

/**
 * @author Michael Zhang
 * @version 18 January 2024
 */

public class Playlist { 
    ArrayList<Song> playlist;

    public Playlist() {
       playlist = new ArrayList<Song>();
    }

    public void addSong(Song song) {
        playlist.add(song);
    }

    public void removeSong(int index) {
        playlist.remove(index);
    }

    public void removeUnlikedSongs() {
        for (int i = 0; i < playlist.size(); i++) {
            if (playlist.get(i).getIsLiked()) {
                playlist.remove(i);
                i--;
            }
        }
    }

    public int getTotalDuration() {
        int totalDuration = 0;

        for (Song song : playlist)
            totalDuration += song.getDuration();

        return totalDuration;
    }

    public void likeSong(int index) {
        playlist.get(index).like();
    }

    public String getLikedSongs() {
        ArrayList<Song> likedSongs = new ArrayList<Song>();

        for (Song song : playlist) 
            if (song.getIsLiked())
                likedSongs.add(song);

        return printSongs(likedSongs);
    }

    public String getAllSongs() {
        return printSongs(playlist);
    }

    private String printSongs(ArrayList<Song> songs) {
        String str = "";

        for (Song song : songs) {
            str += song;
        }

        return str;
    }
}