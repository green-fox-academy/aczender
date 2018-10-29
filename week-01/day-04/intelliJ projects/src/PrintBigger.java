import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {

        System.out.println("Please add a numnber: ");
        Scanner scanner = new Scanner(System.in);
        int randomNumber = scanner.nextInt();
        System.out.println("Please add another numnber: ");
        int randomNumber2 = scanner.nextInt();

        if(randomNumber > randomNumber2){
            System.out.println(randomNumber);
        }
        else if(randomNumber2 > randomNumber) {
            System.out.println(randomNumber2);
        }
        else {
            System.out.println("Please restart program");
        }
    }
}
