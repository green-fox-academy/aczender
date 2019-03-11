import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(factorio(number));

    }

    public static int factorio(int number) {

        int fact = 1;

        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
