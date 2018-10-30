import java.util.Scanner;

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
    }

}
