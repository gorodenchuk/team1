package com.aqa12.team1;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public final class Song implements Comparable<Song> {
    private final String artist;
    private final String song;
    private final String time;

    @JsonCreator
    public Song(@JsonProperty("artist") String artist,
                @JsonProperty("song") String song,
                @JsonProperty("time") String time) {
        this.artist = artist;
        this.song = song;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Track [song = " + song + ", time = " + time + ", artist = " + artist + "]\n";
    }

    public int compareTo(Song o) {
        int diffSong = this.song.compareTo(o.song);
        if (diffSong == 0) {
            int diffArtist = this.artist.compareTo(o.artist);
            if (diffArtist == 0) {
                int diffTime = this.time.compareTo(o.time);
                return diffTime;
            } else
                return diffArtist;
        } else {
            return diffSong;
        }
    }
}
