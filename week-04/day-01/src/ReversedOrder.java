import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {
    public static void main(String[] args) {
        // Create a method that decrypts reversed-order.txt
        reversedO("reversed-order.txt");
    }

    public static void reversedO(String path) {
        Path filePath = Paths.get("reversed-order.txt");
        try {
            List<String> lines = Files.readAllLines(filePath);

            List<String> reversed = new ArrayList<>();

            for (int i = 0; i < lines.size(); i++) {
                reversed.add(lines.get(lines.size() - 1 - i));
                reversed.add("\n");
            }
            System.out.println(reversed.toString());

        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

}
