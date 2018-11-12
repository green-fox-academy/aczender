import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatReview {

    public static void main(String[] args) {
        Path filePath = Paths.get("./countinglines.txt");
        Path filePath2 = Paths.get("C:\\Users\\felhasználó\\Documents\\greenfox\\aczender\\week" +
                "-04\\day-01");


        List<String> inputList = new ArrayList<>(Arrays.asList("hello2", "hello3"));

        try {
            List<String> lines = Files.readAllLines(filePath);  //it will read all lines. will
            // give you a list of strings
            System.out.println(lines);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("file cannot be found");
        } catch (Exception exception) {
            exception.printStackTrace();
            System.out.println("an error happened");
        } finally {
            System.out.println("this block finally happened");
        }

        try {
            Files.write(filePath, inputList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
