import java.util.Arrays;

public class Anagram {

    public static boolean anagram(String first, String second) {

        if (first == null || second == null)
            return false;
        if (first.length() != second.length())
            return false;
        char[] case1 = (first.toLowerCase()).toCharArray();
        char[] case2 = (second.toLowerCase()).toCharArray();
        Arrays.sort(case1);
        Arrays.sort(case2);
        if (Arrays.equals(case1, case2))
            return true;

        else
            return false;
    }
}
