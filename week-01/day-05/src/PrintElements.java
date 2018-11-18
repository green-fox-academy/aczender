import java.util.Arrays;

public class PrintElements {
    public static void main(String[] args) {
        int[] numbers = {4, 5, 6, 7};
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }
    }
}
