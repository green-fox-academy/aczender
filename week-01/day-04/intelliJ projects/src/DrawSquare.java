import java.util.Scanner;

// The square should have as many lines as the number was
public class DrawSquare {
    public static void main(String[] args) {
        System.out.print("Number for square: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = number; j <= number; j++) {
                System.out.print("%");
            }
        }
        System.out.println();
        for (int o = 0; o < number-2; o++) {

            for (int k = 1; k <= 2; k++) {
                System.out.print("%");
                for (int m = (number - 2); m >= 1; m--) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = 1; i <= number; i++) {
            for (int j = number; j <= number; j++) {
                System.out.print("%");
            }
        }

    }
}
