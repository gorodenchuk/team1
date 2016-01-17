package com.aqa12.team1;

public class Main {

    public static void main(String[] args) {
        Album album1 = Album.parse("songs.json");
        album1.sort();
        System.out.print(album1);

    }
}
