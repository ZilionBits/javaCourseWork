import java.util.Objects;

public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }
    public boolean equals(Object song) {
        if (this == song) {
            return true;
        }
        if (!(song instanceof Song)) {
            return false;
        }
        Song another = (Song) song;
        return durationInSeconds == another.durationInSeconds &&
                Objects.equals(artist,another.artist) &&
                Objects.equals(name, another.name);
    }


    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
