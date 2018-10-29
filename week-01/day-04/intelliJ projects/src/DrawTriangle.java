import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        System.out.println("Number for triangle: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println("*" * number);
    }
}