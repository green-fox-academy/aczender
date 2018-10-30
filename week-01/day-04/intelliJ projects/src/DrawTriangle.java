import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        System.out.println("Number for triangle: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 1; i < number; i++) {
            System.out.println(new String(new char[i]).replace("\0","*"));
        }

    }
}