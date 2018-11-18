import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please add a numnber: ");
        int randomNumber = scanner.nextInt();

        if (randomNumber <= 0) {
            System.out.println("Not enough");
        } else if (randomNumber == 1) {
            System.out.println("One");
        } else if (randomNumber == 2) {
            System.out.println("Two");
        } else {
            System.out.println("A lot");
        }
    }
}
