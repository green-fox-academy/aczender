import java.util.Random;
import java.util.Scanner;
// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stored number is lower
// You found the number: 8

public class GuessTheNumber {
    public static void main(String[] args) {

        Random random = new Random();
        int stored = random.nextInt(20);
        int number;
        int guess = 0;


        do {
            System.out.print("Guess a number: ");
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();
            guess++;


            if (stored > number) {
                System.out.println("The stored number is higher");
            } else if (stored < number) {
                System.out.println("The stored number is lower");
            }
        }
        while (stored != number && guess < 10);
        if (stored == number) {
            System.out.println("You won");
        } else if (guess == 10) {
            System.out.println("You lost");
        }

    }
}