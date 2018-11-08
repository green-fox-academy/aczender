import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class PalindromeBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add a string: ");
        String first = scanner.next();

        System.out.println(palindrome(first));
        palindrome(first);
    }

    public static String palindrome(String first) {
        char[] output = first.toCharArray();
        String that = first;

        // WITH STRINGBUILDER
       /* StringBuilder together = new StringBuilder();
        for (int i = output.length - 1; i >= 0; i--) {
            together.append(output[i]);
        }
        that = together + first;

        return that;*/

        // WITHOUT STRINGBUILDER

        for (int i = first.length() - 1; i >= 0; i--) {
            that = that + first.charAt(i);
        }
        return that;
    }
}
