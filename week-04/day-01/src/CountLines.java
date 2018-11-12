import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
    // Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.
    public static void main(String[] args) {

        System.out.println(countLines("countinglines.txt"));
    }


    public static int countLines(String file) {
        int count = 0;
        try {
            Path filePath = Paths.get(file);
            List<String> lines = Files.readAllLines(filePath);
            for (String line : lines) {
                count++;
                System.out.println(line);
            }
        } catch (Exception ex) {
            return 0;
        }
        return count;
    }


}

