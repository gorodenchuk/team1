package packageForParser;


public class Main {

    public static void main(String[] args) {
        SongsMapper.parser("src\\main\\java\\packageForParser\\Songs");
        System.out.println(SongsMapper.songsList);
    }
}
