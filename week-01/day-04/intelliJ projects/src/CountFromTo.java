import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {

        System.out.println("Number one: ");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        System.out.println("Number two: ");
        int number2 = scanner.nextInt();

        if(number1 >= number2) {
            System.out.println("The second number should be bigger");
        }
        else {
            for (int i = number1; i < number2; i++) {
                System.out.println(i);
            }
        }

    }
}