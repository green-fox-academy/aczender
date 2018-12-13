import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteMultipleLines {
    public static void main(String[] args) {
        multiple("multiple.txt", "apple", 6);
    }

    public static void multiple(String path, String input, int result) {


        List<String> content = new ArrayList<>();   //creates a String that will be added to the file
        try {
            for (int i = 0; i < result; i++) {
                content.add(input);                       //this writes the content to the file
            }
            Path filePath = Paths.get(path);    //opens and/or creates the file
            Files.write(filePath, content);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
