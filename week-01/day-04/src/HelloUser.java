import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide your name: ");
        String userName = scanner.nextLine();
        System.out.println("Hello: " + userName + "!");
    }
}
