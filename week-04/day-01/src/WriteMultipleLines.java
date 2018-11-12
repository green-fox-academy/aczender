import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteMultipleLines {
    public static void main(String[] args) {
        multiple();
    }

    public static void multiple() {
        Scanner scanner = new Scanner(System.in);   //opens the scanner
        String line = scanner.next();               //asks for the 'line' content from user input
        int number = scanner.nextInt();             //asks for the number of times to write
        List<String> content = new ArrayList<>();   //creates a String that will be added to the
        // file
        content.add(line);                          //this 'line' will be added to the file
        try {
            for (int i = 0; i < number; i++) {
                content.add(line);                       //this writes the content to
                // the file
            }
            Path filePath = Paths.get("multiple.txt");    //opens and/or creates the file
            Files.write(filePath, content);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
