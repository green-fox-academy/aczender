import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        int chickenLeg = 2;
        int pigLeg = 4;

        Scanner scanner = new Scanner(System.in);
        System.out.println ("How many chickens the farmer has?");
        int chickens = scanner.nextInt();
        System.out.println ("How many pigs the farmer has?");
        int pigs = scanner.nextInt();

        System.out.println("The farmer has: " + (chickenLeg*chickens + pigLeg*pigs) + " legs");
    }
}
