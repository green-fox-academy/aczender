import java.util.Scanner;
// The diamond should have as many lines as the number was

public class DrawDiamond {
    public static void main(String[] args) {
        System.out.print("Number for pyramid: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = (number - i); j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int m = 1; m <= number; m++) {
            for (int n = m; n>= 1; n--) {
                System.out.print(" ");
            }
            for (int l = 1; l <= (number - m) * 2 - 1; l++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
