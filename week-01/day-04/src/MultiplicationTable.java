import java.util.Scanner;
// Create a program that asks for a number and prints the multiplication table with that number

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Number to multiply with: ");
        Scanner scanner = new Scanner(System.in);
        int multiNumber = scanner.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(i + " * " + multiNumber + " = " + i*multiNumber);
        }
    }
}
