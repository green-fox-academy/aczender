import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
       /* sides a, b, c
        surface = 600; // 2ab + 2ac + 2bc
        volume = 1000; // a * b * c
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please add the numbers: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();


        System.out.println("Surface area: " + (2*a*b + 2*a*c + 2*b*c));
        System.out.println("Volume: " + a * b * c);
    }
}
