import java.util.HashMap;
import java.util.Map;


public class CountLetters {

    public static HashMap<Character, Integer> countLetters(String string) {
        HashMap<Character, Integer> items = new HashMap<Character, Integer>();

        for (int i = 0; i < string.length(); i++) {
            if (!items.containsKey(string.charAt(i))) {
                items.put(string.charAt(i), 1);
            } else {
                items.put(string.charAt(i), items.get(string.charAt(i)) + 1);
            }
        }
        return items;
    }
}
