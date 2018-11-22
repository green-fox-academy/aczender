import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by aze on 2017.04.04..
 */
public class Extension {
    int add(int a, int b) {
        return a + b;                     //changed '5' to 'a + b'
    }

    int maxOfThree(int a, int b, int c) {  //added further comparisons ('a' to 'c' and 'b')
        if (a > b && a > c) return a;
        else if (a < b || b < c) return b;
        else return c;
    }

    int median(List<Integer> pool) {       //added if statement for the even numbers
        Collections.sort(pool);
        if (pool.size() % 2 == 0) {
            return (int) ((pool.get(pool.size() / 2 - 1) + pool.get(pool.size() / 2)) / 2.0);
        } else {
            return pool.get((pool.size() - 1) / 2);
        }
    }

    boolean isVowel(char c) { //only accepts lowerCase vowels

        return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(Character.toLowerCase(c));
    }

    String translate(String hungarian) {
        String teve = hungarian;
        int length = teve.length();
        for (int i = 0; i < length; i++) {
            char c = teve.charAt(i);
            if (isVowel(c)) {
                teve = String.join(c + "v" + c, teve.split("" + c));
                i += 2;
                length += 2;
            }
        }
        return teve;
    }
}