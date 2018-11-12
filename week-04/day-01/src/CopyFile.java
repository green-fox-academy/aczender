import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

public class CopyFile {
    public static void main(String[] args) {
        System.out.println(copied("first.txt", "second.txt"));
    }

    public static boolean copied(String first, String second) {
        int count = 0;
        try {
            Path filePath = Paths.get(first);
            List<String> lines = Files.readAllLines(filePath);
            for (String line : lines) {
                count++;
            }
            Path filePath2 = Paths.get(second);
            Files.write(filePath2,lines);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
