public class Album
{
    // instance variables 
    private String name;
    private Song song1, song2, song3, song4;
    private int totalTime;
    private final static int MAX_TIME = 1200; //20 minutes

    
    
    //-----------------------------------------------
    // Constructor for objects of class Album
    
    public Album(String name) {
        this.name = name;
    }
    //-----------------------------------------------
    

    public void addSong(String name, String artist, int duration, String genre) {
        // find empty song variable and add song to it
        // if duration of album > 1200 seconds (20 mins), print "Album is full"
        
        if (song1 == null) song1 = new Song(name, artist, duration, genre);
        else if (song2 == null) song2 = new Song(name, artist, duration, genre);
        else if (song3 == null) song3 = new Song(name, artist, duration, genre);
        else if (song4 == null) song4 = new Song(name, artist, duration, genre);
        else System.out.println("Album is full");
        
            if (totalTime + duration > MAX_TIME) {
                System.out.println("Album is full (Cannot be > 1200 seconds)");
            } else {
                totalTime += duration;
            }
    }
    

    //-----------------------------------------------
    // setters and getters
    public void setName (String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    
    // experimental method for getting a song
    public Song getSong(int songNumber) {
        if (songNumber == 1) return song1;
        else if (songNumber == 2) return song2;
        else if (songNumber == 3) return song3;
        else if (songNumber == 4) return song4;
        return null;
        
    }

    public Song getSong1() {
        return song1;
    }

    public void setSong1(Song song1) {
        this.song1 = song1;
    }

    public Song getSong2() {
        return song2;
    }

    public void setSong2(Song song2) {
        this.song2 = song2;
    }

    public Song getSong3() {
        return song3;
    }

    public void setSong3(Song song3) {
        this.song3 = song3;
    }

    public Song getSong4() {
        return song4;
    }

    public void setSong4(Song song4) {
        this.song4 = song4;
    }
 
    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    public static int getMAX_TIME() {
        return MAX_TIME;
    }
    //-----------------------------------------------

}