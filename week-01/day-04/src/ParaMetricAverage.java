import java.util.Scanner;

public class ParaMetricAverage {
    public static void main(String[] args) {

        System.out.print("Please provide a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int sum = 0;
        System.out.println("Please add more numbers: ");
        for (int i = 0; i < number; i++) {
            sum += scanner.nextInt();
        }


        double average = sum / number;


        System.out.println("Sum: " + sum + "\r\n" + "Average: " + average);
    }
}