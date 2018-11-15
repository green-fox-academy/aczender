import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please add a numnber: ");
        int randomNumber = scanner.nextInt();

        if (randomNumber % 2 == 0) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }
}
