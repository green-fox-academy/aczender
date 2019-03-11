import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println ("Please add a km amount: ");
        int kmAmount = scanner.nextInt();
        System.out.println("Your km in miles: " + kmAmount*0.621371192);
    }
}
