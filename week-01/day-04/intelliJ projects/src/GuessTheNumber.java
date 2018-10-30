import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        Random random = new Random();
        int stored = random.nextInt(50);
        int number;


        do {
            System.out.print("Guess a number: ");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();

            if (stored > number) {
                System.out.println("The stored number is higher");
            } else if (stored < number) {
                System.out.println("The stored number is lower");
            } else {
                System.out.println("You found the number: " + stored);
            }
        }
        while(number != stored);
    }
}
