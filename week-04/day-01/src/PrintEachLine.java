import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args) {
        // Write a program that opens a file called "my-file.txt", then prints
        // each of the lines form the file.
        // If the program is unable to read the file (for example it does not exists),
        // then it should print an error message like: "Unable to read file: my-file.txt"
        List<String> content = new ArrayList<>();
        content.add("First line of my file \n and the second");
        Path filePath = Paths.get("my-file.txt");
        try {
            Files.write(filePath, content);
        } catch (IOException e) {
            e.printStackTrace();
        }

       try {
            List<String> lines = Files.readAllLines(filePath);
            for (String line : lines) {
            System.out.println(line);
            }
        }catch (IOException ex){
            System.out.println("Unable to read file: my-file.txt");
        }


    }
}