package packageForParser;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class AlbumMapper {

    public static List<Album> albumList;

    public static List parser(String response) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            albumList = mapper.readValue(new File(response), new TypeReference<List<Album>>() {
            });
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return albumList;
    }
}
