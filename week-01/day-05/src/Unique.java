import java.util.ArrayList;
import java.util.Arrays;

public class Unique {
    public static void main(String[] args) {

        //  Create a function that takes a list of numbers as a parameter
        //  Returns a list of numbers where every number in the list occurs only once
        //  Example
        //  should print: `[1, 11, 34, 52, 61]`
        int[] list = {1, 11, 34, 11, 52, 61, 1, 34};
        int[] list1 = even(list);

        for (int i = 0; i < list1.length ; i++) {
            System.out.println(list1[i]);
        }
    }

    public static int[] even(int[] altered) {
        Arrays.sort(altered);
        int[] even = new int[0];


        for (int i = 0; i < altered.length - 1; i++) {
            if (altered[i] != altered[i + 1]) {
                even = add(even, altered[i]);
            }
        }
        even = add(even, altered[altered.length - 1]);
        return even;
    }

    public static int[] add(int[] array, int number) {
        int[] addArray = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            addArray[i] = array[i];
        }
        addArray[addArray.length - 1] = number;
        return addArray;
    }
}