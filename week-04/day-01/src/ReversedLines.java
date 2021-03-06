import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-lines.txt
        toReverse("reversed-lines.txt");
    }

    private static void toReverse(String path) {
        Path filePath = Paths.get(path);
        String reverse = "";
        try {
            List<String> lines = Files.readAllLines(filePath);
            for (String line : lines) {
                for (int i = 0; i < line.length(); i++) {
                    reverse = reverse + line.charAt(line.length() - 1 - i);
                }
                reverse += "";
            }
            System.out.println(reverse);

        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
