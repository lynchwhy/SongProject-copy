import java.util.*;

public class SongCollection
{
     private Album album1, album2, album3;
     
     Scanner scanner = new Scanner(System.in);

    public void run(){
        //this method should control the flow of the program
        
        int menu;
        
        do {
        menu = displayMenu();
        } while (menu !=0);
    }
    
    public static void main(String[] args) {
        SongCollection sg = new SongCollection();
        sg.run();
    }
    
    // Displays the menu and returns the user's selection
    public int displayMenu() {
        System.out.println("");
        System.out.println("===== Song Collection Menu =====");
        System.out.println("1. Create an album");
        System.out.println("2. Add a song to an album");
        System.out.println("3. View all songs in an album");
        System.out.println("4. View all albums and their songs");
        System.out.println("5. View all songs under a certain duration");
        System.out.println("6. View all songs of a certain genre");
        System.out.println("7. Delete an album");
        System.out.println("8. Delete a song from an album");
        System.out.println("9. **ADD TESTING DATA**");
        System.out.println("0. Exit");
        System.out.println("================================");
        System.out.println("Enter your selection: (1-8, 0 to exit)");

        int selection = scanner.nextInt();
        
        switch (selection) {
            case 1: 
                // method used to create an album
                createAlbum();
                break;
            
            case 2:
                // method used to add a new song to album
                addSongToAlbum();
                break;

            case 3:
                // list songs in album method // NEED TO ADD MESSAGE FOR "NO SONGS"
                if (album1 != null) System.out.println("1. " + printAlbum(album1));
                if (album2 != null) System.out.println("2. " + printAlbum(album2));
                if (album3 != null) System.out.println("3. " + printAlbum(album3));
                if (album1 == null && album2 == null && album3 == null) System.out.println("No albums stored");
            
                System.out.println("Which album would you like to view? (enter 1, 2 or 3)");
                int albumNumber = scanner.nextInt();
                
                if (albumNumber == 1) {
                    System.out.println(printAlbum(album1));
                    if (album1.getSong1() !=null) System.out.println("     1. " + printSong(album1.getSong1()));
                    if (album1.getSong2() !=null) System.out.println("     2. " + printSong(album1.getSong2()));
                    if (album1.getSong3() !=null) System.out.println("     3. " + printSong(album1.getSong3()));
                    if (album1.getSong4() !=null) System.out.println("     4. " + printSong(album1.getSong4()));
                }
                else if (albumNumber == 2) {
                    System.out.println(printAlbum(album2));
                    if (album2.getSong1() != null) System.out.println("    1. " + printSong(album2.getSong1()));
                    if (album2.getSong2() != null) System.out.println("    2. " + printSong(album2.getSong2()));
                    if (album2.getSong3() != null) System.out.println("    3. " + printSong(album2.getSong3()));
                    if (album2.getSong4() != null) System.out.println("    4. " + printSong(album2.getSong4()));
                }
                else if (albumNumber == 3) {
                    System.out.println(printAlbum(album3));
                    if (album3.getSong1() != null) System.out.println("    1. " + printSong(album3.getSong1()));
                    if (album3.getSong2() != null) System.out.println("    2. " + printSong(album3.getSong2()));
                    if (album3.getSong3() != null) System.out.println("    3. " + printSong(album3.getSong3()));
                    if (album3.getSong4() != null) System.out.println("    4. " + printSong(album3.getSong4()));
                }

                break;
            case 4:
                // displays albums and their songs
                if (album1 != null) {
                    System.out.println("1. " + printAlbum(album1));
                    if (album1.getSong1() != null) System.out.println("    1. " + printSong(album1.getSong1()));
                    if (album1.getSong2() != null) System.out.println("    2. " + printSong(album1.getSong2()));
                    if (album1.getSong3() != null) System.out.println("    3. " + printSong(album1.getSong3()));
                    if (album1.getSong4() != null) System.out.println("    4. " + printSong(album1.getSong4()) + "\n");
                }
                if (album2 != null) {
                    System.out.println("2. " + printAlbum(album2));
                    if (album2.getSong1() != null) System.out.println("    1. " + printSong(album2.getSong1()));
                    if (album2.getSong2() != null) System.out.println("    2. " + printSong(album2.getSong2()));
                    if (album2.getSong3() != null) System.out.println("    3. " + printSong(album2.getSong3()));
                    if (album2.getSong4() != null) System.out.println("    4. " + printSong(album2.getSong4()) + "\n");
                }
                if (album3 != null) {
                    System.out.println("3. " + printAlbum(album3));
                    if (album3.getSong1() != null) System.out.println("    1. " + printSong(album3.getSong1()));
                    if (album3.getSong2() != null) System.out.println("    2. " + printSong(album3.getSong2()));
                    if (album3.getSong3() != null) System.out.println("    3. " + printSong(album3.getSong3()));
                    if (album3.getSong4() != null) System.out.println("    4. " + printSong(album3.getSong4()) + "\n");
                }                
                
        

                break;
            case 5:
                //list songs under a certain time method
                
                break;
            case 6:
                // list songs of a genre
                printAllSongsOfGenre();
                break;
            case 7:
                //delete album method
                deleteAlbum();
                break;
            case 8:
                //delete a song from album method
                deleteSong(album1); //MAKE THIS USER INPUT
                break;

            case 9:
                // add test data method
                System.out.println(addTestData());
                break;
            case 0:
                System.out.println("Exiting program.");
                break;
            default:
                System.out.println("Invalid selection. Please try again.");
                break;
            }
                
        
        return selection;
    }
  
    // method to get album objects 1-3
    public Album getAlbum(int i) {
        if (i == 1) return album1;
        else if (i == 2) return album2;
        else if (i == 3) return album3;
        else return null;
    }

    public void createAlbum() {
        scanner.nextLine();
        if (album1 == null) {
            System.out.println("Enter name for Album 1: ");
            album1 = new Album(scanner.nextLine());
            System.out.println("Album 1 created");
        } else if (album2 == null) {
            System.out.println("Enter name for Album 2: ");
            album2 = new Album(scanner.nextLine());
            System.out.println("Album 2 created");
        } else if (album3 == null) {
            System.out.println("Enter name for Album 3: ");
            album3 = new Album(scanner.nextLine());
            System.out.println("Album 3 created");
        } else {
            System.out.println("Album storage is full");
        }
    }
    
    public void addSongToAlbum() {
                // display all album names 
                // ask user which album to add song to
                // check if album is full
                // allow user to set name, artist, duration and genre of new song
                // confirm song creation
                if (album1 != null) System.out.println("1. " + printAlbum(album1)); //NEED VALIDATION FOR ADDING SONG WHEN ALBUM IS FULL
                if (album2 != null) System.out.println("2. " + printAlbum(album2));
                if (album3 != null) System.out.println("3. " + printAlbum(album3));
                if (album1 == null && album2 == null && album3 == null) System.out.println("No albums stored"); // THIS NEEDS BREAK THE LOOP?
                
                System.out.println("Which album would you like to add a song to? (enter 1, 2 or 3)"); //THIS NEEDS TO BE INSIDE A LOOP?
                int albumNumber = scanner.nextInt();
                
                if (albumNumber == 1) {
                    if (album1.getSong1() != null && album1.getSong2() != null && album1.getSong3() != null && album1.getSong4() != null) {
                        System.out.println("Album is full");
                    } else {
                        System.out.println("Enter name of song: ");
                        scanner.nextLine();
                        String name = scanner.nextLine();
                        System.out.println("Enter artist of song: ");
                        String artist = scanner.nextLine();
                        System.out.println("Enter duration of song (in seconds): ");
                        int duration = scanner.nextInt();
                        System.out.println("Entre genre (\"rock\", \"pop\", \"hip-hop\" or \"bossa nova\"): ");
                        scanner.nextLine();
                        String genre = scanner.nextLine();
                            while (!genre.equals("rock") && !genre.equals("pop") && !genre.equals("hip-hop") && !genre.equals("bossa nova")) {
                                System.out.println("Invalid genre, please enter again:");
                                genre = scanner.nextLine();
                            }

                        album1.addSong(name, artist, duration, genre); // uses method from Album class to add song
                        System.out.println("Song added to " + album1.getName());
                    }
                } else if (albumNumber == 2) { // NEED TO DUPLICATE CODE FROM ABOVE OR CREATE METHOD
                } else if (albumNumber == 3) {}
    }
    // Allows user to select and delete an album
    public void deleteAlbum() {
        System.out.println("Which album would you like to delete? (1-3)");
        printAllAlbums();
        int albumNumber = scanner.nextInt();
        switch (albumNumber) {
            case 1:
                album1 = null;
                System.out.println("Album 1 deleted");
                break;
            case 2:
                album2 = null;
                System.out.println("Album 2 deleted");
                break;
            case 3:
                album3 = null;
                System.out.println("Album 3 deleted");
                break;
            default:
                System.out.println("Invalid selection. Please try again.");
                break;
        }
    }
    
    public String printAlbum(Album album) {
        return album.getName() + " (" + album.getTotalTime() + "/" + Album.getMAX_TIME() + " seconds)";
    }

    public void printAllAlbums() {
        if (album1 != null) System.out.println("1. " + printAlbum(album1));
        if (album2 != null) System.out.println("2. " + printAlbum(album2));
        if (album3 != null) System.out.println("3. " + printAlbum(album3));
    }
    
    public String printSong(Song song) {
        return song.getName() + " (by) " + song.getArtist() + " (" + song.getDuration() + " seconds) [" + song.getGenre() + "]";
    }
   
    // Prints all songs in an album
    public String printAllSongs(Album album) {
        String allSongs = "";
        if (album.getSong1() != null) {
            allSongs += "    1. " + printSong(album.getSong1()) +"\n";
        }
        if (album.getSong2() != null) {
            allSongs += "    2. " + printSong(album.getSong2()) +"\n";
        }
        if (album.getSong3() != null) {
            allSongs += "    3. " + printSong(album.getSong3()) +"\n";
        }
        if (album.getSong4() != null) {
            allSongs += "    4. " + printSong(album.getSong4()) +"\n";
        }
        return allSongs;
    }
    
    // Allows user to select and delete a song from an album
    public void deleteSong(Album album) {
        printAllAlbums();
        if (album1 == null && album2 == null && album3 == null) System.out.println("No albums stored");
            
            System.out.println("Which album would you like to delete song from? (enter 1, 2 or 3)");
            int albumNumber = scanner.nextInt();
                
            
            

            System.out.println("Which song would you like to delete? (1-4)");
            System.out.println(printAllSongs(album));
            int songNumber = scanner.nextInt();
            switch (songNumber) {
                case 1:
                    album.setSong1(null);
                    System.out.println("Song 1 deleted");
                    break;
                case 2:
                    album.setSong2(null);
                    System.out.println("Song 2 deleted");
                    break;
                case 3:
                    album.setSong3(null);
                    System.out.println("Song 3 deleted");
                    break;
                case 4:
                    album.setSong4(null);
                    System.out.println("Song 4 deleted");
                    break;
                default:
                    System.out.println("Invalid selection. Please try again.");
                    break;
        }
    }

    // Allows user to select and print all songs of a genre
    public void printAllSongsOfGenre(){
        System.out.println("Which genre would you like to view? (1-4)");
        System.out.println("1. Rock");
        System.out.println("2. Pop");
        System.out.println("3. Hip-Hop");
        System.out.println("4. Bossa Nova");
        int genreNumber = scanner.nextInt();
        String genre = "";
        switch (genreNumber) {
            case 1:
                genre = "rock";
                break;
            case 2:
                genre = "pop";
                break;
            case 3:
                genre = "hip-hop";
                break;
            case 4:
                genre = "bossa nova";
                break;
            default:
                System.out.println("Invalid selection. Please try again.");
                break;
        }
        if (album1 == null && album2 == null && album3 == null) {
            System.out.println("No songs found");
        }
        for (int i = 1; i <= 3; i++) {
            Album album = getAlbum(i);
            if (album != null) { 
                for (int j = 1; j <= 4; j++) {
                    Song song = album.getSong(j);
                    if (song != null) { 
                        if (album.getSong(j).getGenre().equals(genre)) {
                            System.out.println(printSong(album.getSong(j)));
                        }
                    }
                }
            }
        }
    }




    

    // method to add testing data ------------------------------------------------------------
    public String addTestData() {
        album1 = new Album("The Dark Side of the Moon");
        album1.addSong("Speak to Me", "Pink Floyd", 90, "rock");
        album1.addSong("Breathe", "Pink Floyd", 163, "pop");
        album1.addSong("On the Run", "Pink Floyd", 216, "hip-hop");
        album1.addSong("Time", "Pink Floyd", 421, "bossa nova");
        
        album2 = new Album("The Wall");
        album2.addSong("In the Flesh?", "Pink Floyd", 216, "rock");
        album2.addSong("The Thin Ice", "Pink Floyd", 183, "rock");
        album2.addSong("Another Brick in the Wall, Part 1", "Pink Floyd", 295, "rock");
        album2.addSong("The Happiest Days of Our Lives", "Pink Floyd", 216, "rock");
       
        album3 = new Album("Wish You Were Here");
        album3.addSong("Shine On You Crazy Diamond", "Pink Floyd", 216, "rock");
        album3.addSong("Welcome to the Machine", "Pink Floyd", 183, "rock");
        album3.addSong("Have a Cigar", "Pink Floyd", 295, "rock");
        album3.addSong("Wish You Were Here", "Pink Floyd", 216, "rock");

        return "Test data added.";
    
    }
}
