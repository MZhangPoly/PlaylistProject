/**
 * @author Michael Zhang
 * @version 18 January 2024
 */
public class PlaylistTester {
    public static void main(String[] args) {
        System.out.println("Initializing a Playlist...\n");
        //Make your playlist here
        Playlist playlist = new Playlist();

        System.out.println("Adding songs to the Playlist...\n");
        /**
         * Add some songs here. Note that the format for adding a Song to a Playlist p
         * is something like...
         * p.addSong(new Song(..., ..., ...))
         */

         playlist.addSong(new Song("21", "Polo G", 164));
         playlist.addSong(new Song("Martin & Gina", "Polo G", 133));
         playlist.addSong(new Song("I Know", "Polo G", 177));
         playlist.addSong(new Song("500lbs", "Lil Tecca", 144));

        System.out.println("Printing the songs...\n");
        //Print out all the songs in the playlist to verify it's working correctly
        System.out.println(playlist);

        System.out.println("\nLiking the songs in position 1 and 3...\n");
        //Once your songs are 'liked', this should be reflected in the next printout
        playlist.likeSong(1);
        playlist.likeSong(3);

        System.out.println("Printing the songs...\n");
        System.out.println(playlist);

        System.out.println("\nRemoving the song in position 0 and 1...\n");
        playlist.removeSong(0);
        playlist.removeSong(0);

        System.out.println("Printing the songs...\n");

        System.out.println(playlist);

        System.out.println("\nPrinting only the liked songs...\n");
        //Your Playlist should be able to do this without looping while in main!
        System.out.println(playlist.getLikedSongs());

        System.out.println("\nPrinting the total duration of all songs...\n");
        //Note that the format should look something like minutes:seconds
        System.out.println(playlist.getTotalDuration());

        System.out.println("\nRemoving all unliked songs from the playlist...\n");
        //This should be doable with a single method call
        playlist.removeUnlikedSongs();

        System.out.println("Printing all songs...\n");
        //This should now look like only the liked songs list from before
        System.out.println(playlist.getAllSongs());
    }
}