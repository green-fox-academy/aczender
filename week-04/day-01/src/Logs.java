import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.

public class Logs {
    public static void main(String[] args) {
        ip();
        ratio();

    }

    public static void ip() {
        int count = 0;
        try {
            Path filePath = Paths.get("log.txt");
            List<String> lines = Files.readAllLines(filePath);
            for (String line : lines) {
                count++;
                line.substring(27, 38);

                //Try to solve it with split as well
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void ratio() {
        int numOfPost = 0;
        try {
            Path filePath = Paths.get("log.txt");
            List<String> lines = Files.readAllLines(filePath);
            for (String line : lines) {
                if (line.endsWith("GET /")) {
                } else {
                    numOfPost++;
                }
            }
            int post = numOfPost;
            double get = lines.size() - numOfPost;
            System.out.println(post);
            System.out.println(get);
            System.out.println(get / post);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

