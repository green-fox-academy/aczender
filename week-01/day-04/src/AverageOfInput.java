import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        System.out.println("Add five numbers");

        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        // CODE WITH WHILE LOOP
        int numberOfTimes = 0;
        while (numberOfTimes < 5) {
            sum += scanner.nextInt();
            numberOfTimes += 1;

        }
        double average = sum / numberOfTimes;
        /*
        for (int i = 0; i < 5; i++) {
            int numberOfTimes = scanner.nextInt();
        }*/

        System.out.println("Sum: " + sum + "\r\n" + "Average: " + average);
    }
}
