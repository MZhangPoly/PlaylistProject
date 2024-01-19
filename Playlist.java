import java.util.ArrayList;

public class Playlist { 
    ArrayList<Song> playlist;

    public Playlist() {
       playlist = new ArrayList<Song>();
    }
      
      /**
       * Methods-- Remember that you need to be able to complete all of the following:
       * 'liking' a song
       * Removing a specific song
       * Examining all Songs (a String return or void print makes sense here)
       * Examining a sublist of all liked songs
       * Determining the total duration of all songs
       * Removing all unliked songs from the playlist (careful with this one!)
       */

    public void addSong(Song song) {
        playlist.add(song);
    }

    public void removeSong(int index) {
        playlist.remove(index);
    }

    public void likeSong(int index) {
        playlist.get(index).like();
    }

    public String getLikedSongs() {
        String likedSongs = "";

        for (Song song : playlist) 
            if (song.getIsLiked())
                likedSongs += song.getName();
        
        return likedSongs;
    }

    public String toString() {
        String str = "";

        for (Song song : playlist) {
            str += song.getName();
        }

        return str;
    }
}