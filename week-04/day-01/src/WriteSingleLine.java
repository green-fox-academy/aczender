import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
    public static void main(String[] args) {
        Path filePath = Paths.get("my-file.txt");
        List<String> content = new ArrayList<>();
        content.add("Andras");
        try {
            Files.write (filePath, content);
        } catch (IOException e){
            e.printStackTrace();
            System.out.println("Unable to write file: my-file.txt");
        }
    }
}
