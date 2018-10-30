import java.util.Scanner;

public class Summing {
    public static void main(String[] args) {
        System.out.println("The total sum is: " + sum());
    }

    public static int sum() {
        System.out.println("Add a number: ");
        Scanner scanner = new Scanner(System.in);
        int summary = scanner.nextInt();

        for (int i = 0; i < 3 ; i++) {
            summary += scanner.nextInt();
        }
        return summary;

    }
}