import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.

public class Logs {
    public static void main(String[] args) {
        ip();
        ratio();
        System.out.println(uniqueIPs("log.txt"));

    }

    public static void ip() {
        int count = 0;
        try {
            Path filePath = Paths.get("log.txt");
            List<String> lines = Files.readAllLines(filePath);
            for (String line : lines) {
                count++;
                line.substring(27, 38);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<String> uniqueIPs(String p) {
        Path path = Paths.get(p);
        ArrayList<String> ips = new ArrayList<>();

        try {
            List<String> lines = Files.readAllLines(path);
            for (int i = 0; i < lines.size(); i++) {
                String[] s = (lines.get(i).split(" "));
                if (!ips.contains(s[8])) {
                    ips.add(s[8]);
                }
            }
        } catch (IOException e) {

        }
        return ips;
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

