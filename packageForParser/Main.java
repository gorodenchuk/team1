package packageForParser;


public class Main {

    public static void main(String[] args) {
        AlbumMapper.parser("src\\packageForParser\\Tracks");
        System.out.println(AlbumMapper.albumList);
    }
}
