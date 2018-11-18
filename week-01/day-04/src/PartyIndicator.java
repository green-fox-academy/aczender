import java.util.Scanner;

public class PartyIndicator {

    public static void main(String[] args) {

        System.out.println("Number of girls ");
        Scanner scanner = new Scanner(System.in);
        int girls = scanner.nextInt();
        System.out.println("Number of boys: ");
        int boys = scanner.nextInt();

        int all = girls + boys;


        if (girls == boys && all >= 20) {
            System.out.println("The party is excellent!");
        } else if (girls != boys && all >= 20) {
            System.out.println("Quite cool party!");
        } else if (girls == 0) {
            System.out.println("Sausage party");
        } else if (all < 20) {
            System.out.println("Average party");
        }


    }
}
