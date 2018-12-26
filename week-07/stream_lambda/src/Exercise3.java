import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise3 {
    public static void main(String[] args) {

//        Write a Stream Expression to find which number squared value is more then 20 from the following list:

        List<Integer> numbers = Arrays.asList(3, 9, 2, 8, 6, 5);

        List<Integer> squareMoreThanTwenty = numbers.stream().map(x -> x * x).filter(x -> x > 20).distinct().collect(Collectors.toList());

        System.out.println(squareMoreThanTwenty);


        for (int i = 0; i < numbers.size(); i++) {
            if (Math.pow(numbers.get(i), 2) > 20) {
                System.out.println(numbers.get(i));
            }

        }
    }
}
