package com.aqa12.team1;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class Album {

    private List<Song> songsList;

    public Album(List<Song> songsList) {
        this.songsList = songsList;
    }

    @Override
    public String toString() {
        return "Album{" +
                "songsList=" + songsList +
                '}';
    }

    public static Album parse(String filePath) {
        String file = Album.class.getClassLoader().getResource(filePath).getFile();
        ObjectMapper mapper = new ObjectMapper();
        Album album = null;
        try {
            List<Song> songs = mapper.readValue(new File(file), new TypeReference<List<Song>>() {
            });
            album = new Album(songs);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return album;
    }

    public void sort() {
        Collections.sort(songsList);
    }
}
