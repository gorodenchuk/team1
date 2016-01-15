package packageForParser;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class SongsMapper {

    public static List<Song> songsList;

    public static List parser(String response) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            songsList = mapper.readValue(new File(response), new TypeReference<List<Song>>() {
            });
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return songsList;
    }
}
