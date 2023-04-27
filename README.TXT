------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all they need to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE:
PURPOSE OF PROJECT:
VERSION or DATE:
HOW TO START THIS PROJECT:
AUTHORS:
USER INSTRUCTIONS:

BUGS:
- (fixed) artist is being stored as duration in menu option 4 for some reason 
- need to be able to take in multiple words when creating an album and song
- if you add a song and the album is then over time, you still get a song added successfully message
- 

ASK TUTOR:
- is there a way to make a method that will work as printAlbum and also in printAllAlbums?





- Could create method isFull() {method checks if duration is >1200secs or has 4 songs?}

- Could we create a method that checks if albumIsFull and/or overtime?

album.1.getSong1().getGenre() ??

take album input
take song input

---------------------------other code methods ----------
public void printAllSongs() {
        if (album1 != null) {
            for (int i = 0; i < 4; i++) {
                System.out.println(printSong(album1.getSong(i)));
            }
        }
        if (album2 != null) {
            for (int i = 0; i < 4; i++) {
                System.out.println(printSong(album2.getSong(i)));
            }
        }
        if (album3 != null) {
            for (int i = 0; i < 4; i++) {
                System.out.println(printSong(album3.getSong(i)));
            }
        }
    }


      public boolean isFull() { //ARE WE USING THIS ANYWHERE?
        if (album1 != null && album2 != null && album3 != null && album1.getTotalTime() <= Album.getMAX_TIME()) {
            return true;
        } else {
            return false;
        }
    }
