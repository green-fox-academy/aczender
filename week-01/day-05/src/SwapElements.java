import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwapElements {
    public static void main(String[] args) {
        String[] abc = {"first", "second", "third"};

        String temp = abc[0];
        abc[0] = abc[2];
        abc[2] = temp;

        System.out.println(Arrays.toString(abc));

        /*Collections.swap(Arrays.asList(abc), 0, 2);
        for (String a : abc) {
            System.out.print(a + " ");*/
        }
    }
