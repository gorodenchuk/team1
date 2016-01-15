package packageForParser;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public final class Song {
    public final String artist;
    public final String song;
    public final String time;

    @JsonCreator
    public Song(@JsonProperty("artist") String artist,
                @JsonProperty("song") String song,
                @JsonProperty("time") String time){
        this.artist = artist;
        this.song = song;
        this.time = time;
    }
        @Override
    public String toString()
    {
        return "Track [song = "+song+", time = "+time+", artist = "+artist+"]";
    }
}
