/**
 * File for a Song class to be used in the Playlist Project
 * @author Daniel Ismagilov
 * @version 1/21/2024
 */
public class Song {
    //Fields-- what information do we want each Song to store?
    private boolean isLiked;
    private String name;
    private int duration;
    private String artist;




    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */
    public Song(String myName, String myArtist, int myDuration, boolean myIsLiked){
        name = myName;
        artist = myArtist;
        duration = myDuration;
        isLiked = myIsLiked;
    }
    public Song(String myName, String myArtist, int myDuration){
        name = myName;
        artist = myArtist;
        duration = myDuration;
        isLiked = false;
    }




     /**
      * Methods-- what will you want each Song to do?
      * Consider all the getter methods (getName, getArtist, etc.)
      * You should probably have a toString method to be able to get the information for the full
      * song easily as well!
      * What kind of mutator (setter) methods will you need?
      */
      public String getName(){
        return name;
      }
      public String getArtist(){
        return artist;
      }
      public int getDuration(){
        return duration;
      }
      public boolean getIsLiked(){
        return isLiked;
      }
      public String toString(){
        return "name: " + name + " artist: " + artist + " duration: " + duration/60+ ":" + duration%60 + " is the song liked: " + isLiked;
      }
      public void like(){
        isLiked = true;
      }


}
