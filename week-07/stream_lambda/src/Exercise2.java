import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise2 {
    public static void main(String[] args) {
        //      2) Write a Stream Expression to get the squared value of the positive numbers from the following list:

        List<Integer> numbers2 = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        numbers2.stream()
                .filter(y -> y > 0)
                .map(y -> y*y)
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
