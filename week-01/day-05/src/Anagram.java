import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        System.out.println("Add a string: ");
        Scanner scanner = new Scanner(System.in);
        String first = scanner.next();
        System.out.println("Add a string: ");
        String second = scanner.next();

        System.out.println(anagram(first, second));

        //if (first.length() != second.length()) return;


    }

    public static boolean anagram(String first, String second) {

        if (first == null || second == null)
            return false;
        if (first.length() != second.length())
            return false;
        char[] test1 = (first.toLowerCase()).toCharArray();
        char[] test2 = (second.toLowerCase()).toCharArray();
        Arrays.sort(test1);
        Arrays.sort(test2);
        if (Arrays.equals(test1, test2))
            return true;

        else
            return false;

    }


}





