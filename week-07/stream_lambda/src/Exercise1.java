import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise1 {
    public static void main(String[] args) {


//    greetingfunction = () -> System.out.print("Hello world");
//
//    doubleNumberFunction = (int a) -> a*2;
//
//    addFunction = (int a, int b) -> a + b;
//
//    // if the second argument is 0, it should return 0
//    safeDivideFunction = (int a, int b) -> {
//        if (b == 0) return 0;
//        return a / b;
//    };
//
//    stringLengthCountFunction = (String s) -> s.length();

//    1) Write a Stream Expression to get the even numbers from the following list:

        List<Integer> numbers = Arrays.asList(1, 3, - 2, - 4, - 7, - 3, - 8, 12, 19, 6, 9, 10, 14);
        numbers.stream().filter(x -> x % 2 ==0)
                .forEach(System.out::print);

    }
}
