import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise8 {
    public static void main(String[] args) {
//        Write a Stream Expression to concatenate a Character list to a string!
        List<Character> characterList = Arrays.asList('t', 'h', 'i', 's', ' ', 'i', 's', ' ', 'L', 'o', 'n', 'd', 'o', 'n');

        String sentence = characterList.stream()
                .map(c -> c.toString())
                .collect(Collectors.joining());

        System.out.println(sentence);

    }
}
