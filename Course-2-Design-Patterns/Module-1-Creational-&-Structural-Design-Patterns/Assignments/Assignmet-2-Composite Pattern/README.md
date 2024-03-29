# Composite Pattern Assignment

## Problem Statement

You have been tasked with developing a playlist application for Android devices using the Java language. Each playlist can consist of songs or other playlists, creating a hierarchical structure. The Composite Pattern is deemed most suitable for this scenario. The provided UML class diagram illustrates the application's objects and relationships, employing the composite pattern.

## UML Class Diagram

![UML Class Diagram](https://github.com/Daniel-Andarge/Software-Design-and-Architecture-Specialization--University-of-Alberta/blob/main/Course-2-Design-Patterns/Module-1-Creational-%26-Structural-Design-Patterns/Assignments/Assignmet-2-Composite%20Pattern/Composite-UML-Class-Diagram.png)

## Code

### [Program.java]

```java
public class Program {

    public static void main(String args[]) {

        // Create a new empty "Study" playlist
        Playlist studyPlaylist = new Playlist("Study");

        // Create a "Synth Pop" playlist and add 2 songs to it.
        Playlist synthPopPlaylist = new Playlist("Synth Pop");
        Song synthPopSong1 = new Song("Girl Like You", "Toro Y Moi" );
        Song synthPopSong2 = new Song("Outside", "TOPS");
        synthPopPlaylist.add(synthPopSong1);
        synthPopPlaylist.add(synthPopSong2);

        // Create an "Experimental" playlist and add 3 songs to it,
        // then set playback speed of the playlist to 0.5x
        Playlist experimentalPlaylist = new Playlist("Experimental");
        Song experimentalSong1 = new Song("About you", "XXYYXX");
        Song experimentalSong2 = new Song("Motivation", "Clams Casino");
        Song experimentalSong3 = new Song("Computer Vision", "Oneohtrix Point Never");
        experimentalPlaylist.add(experimentalSong1);
        experimentalPlaylist.add(experimentalSong2);
        experimentalPlaylist.add(experimentalSong3);
        float slowSpeed = 0.5f;
        experimentalPlaylist.setPlaybackSpeed(slowSpeed);

        // Add the "Synth Pop" playlist to the "Experimental" playlist
        experimentalPlaylist.add(synthPopPlaylist);

        // Add the "Experimental" playlist to the "Study" playlist
        studyPlaylist.add(experimentalPlaylist);

        // Create a new song and set its playback speed to 1.25x, play this song,
        // get the name of glitchSong → "Textuell", then get the artist of this song → "Oval"
        Song glitchSong = new Song("Textuell", "Oval");
        float fasterSpeed = 1.25f;
        glitchSong.setPlaybackSpeed(fasterSpeed);
        glitchSong.play();
        String name = glitchSong.getName();
        String artist = glitchSong.getArtist();
        System.out.println ("The song name is " + name );
        System.out.println ("The song artist is " + artist );

        // Add glitchSong to the "Study" playlist
        studyPlaylist.add(glitchSong);

        // Play "Study" playlist.
        studyPlaylist.play();

        // Get the playlist name of studyPlaylist → "Study"
        System.out.println ("The Playlist's name is " + studyPlaylist.getName() );
    }
}
```

### [IComponent.java]

```java
public interface IComponent {
    // Your code goes here!
}
```

### [Playlist.java]

```java
import java.util.ArrayList;

public class Playlist implements IComponent {

    public String playlistName;
    public ArrayList<IComponent> playlist = new ArrayList();

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
    }

    // Your code goes here!
}
```

### [Song.java]

```java
public class Song implements IComponent {
    public String songName;
    public String artist;
    public float speed = 1; // Default playback speed

    public Song(String songName, String artist ) {
        this.songName = songName;
        this.artist = artist;
    }

    // Your code goes here!
}
```

Please complete the methods as specified in the comments within the code. The provided structure adheres to the Composite Pattern for managing playlists and songs effectively.
