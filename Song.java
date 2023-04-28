public class Song
{
    // instance variables (blueprint for what a Song object will look like)
    private String name;
    private String artist;
    private int duration;
    private String genre;
    
    //-----------------------------------------------
    // constructor methods
    public Song(){
        name = "";
        artist = "";
        duration = 0;
        genre = "";
    }
    // CHANGE THESE NAMES SO THEY MAKE SENSE WITH SONG COLLECTION
    public Song(String inputName, String inputArtist, int inputDuration, String inputGenre) {
        name = inputName;
        artist = inputArtist;
        duration = inputDuration;
        genre = inputGenre;
    }
    //-----------------------------------------------
    // getters and setters 
    public void setName(String inputName) {
         name = inputName;
    }
    public String getName() {
        return name;
    }
        
    public void setArtist(String inputArtist) {
         artist = inputArtist;
    }
    public String getArtist() {
        return artist;
    }
    
    public void setDuration(int inputDuration) {
         duration = inputDuration;
    }
    public int getDuration() {
        return duration;
    }
    
    public void setGenre(String inputGenre) {
        genre = inputGenre;
    }
    
    public String getGenre() {
        return genre;
    }
    //-----------------------------------------------
}
