import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Doubled {

    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt
        toDecode();

    }

    public static void toDecode() {
        Path filePath = Paths.get("duplicated-chars.txt");
        try {
            List<String> lines = Files.readAllLines(filePath);
            StringBuilder sb = new StringBuilder();
            for (String line : lines) {
                for (int i = 0; i < line.length(); i++) {
                    if (i % 2 == 0) {
                        System.out.print(line.charAt(i));
                    }
                }
                System.out.println("");
            }


        } catch (
                IOException e) {
            e.printStackTrace();
        }


    }
}