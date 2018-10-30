import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorio());

    }

        public static int factorio () {
            Scanner scanner = new Scanner(System.in);
            int fact = 1;
            int number = scanner.nextInt();

            for (int i = 1; i <= number; i++) {
                fact = fact * i;
            }

            return fact;

        }
    }
