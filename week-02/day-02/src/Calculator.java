import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    public static void main(String... args) {
        // Create a simple calculator application which reads the parameters from the prompt
        // and prints the result to the prompt.
        // It should support the following operations,
        // create a method named "calculate()":
        // +, -, *, /, % and it should support two operands.
        // The format of the expressions must be: {operation} {operand} {operand}.
        // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

        // You can use the Scanner class
        // It should work like this:

        // Start the program
        // It prints: "Please type in the expression:"
        // Waits for the user input
        // Print the result to the prompt
        // Exit

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type in the expression, separated by commas:");

        String input = scanner.next();
        String[] elements = input.split(",");


        String element1 = elements[0];
        int element2 = Integer.parseInt(elements[1]);
        int element3 = Integer.parseInt(elements[2]);


        System.out.println(calculate(element1, element2, element3));

    }


    public static int calculate(String element1, int element2, int element3) {
        int operation = 0;

        switch (element1) {
            case "+":
                operation = element2 + element3;
                break;
            case "-":
                operation = element2 - element3;
                break;
            case "*":
                operation = element2 * element3;
                break;
            case "/":
                operation = element2 / element3;
                break;
            case "%":
                operation = element2 % element3;
                break;
        }
        return operation;
    }

}