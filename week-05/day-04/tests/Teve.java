import java.util.Arrays;

public class Teve {
    public static void main(String[] args) {
        System.out.println(translate("example"));
    }

    static boolean isVowel(char c) { //only accepts lowerCase vowels

        return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(Character.toLowerCase(c));
    }

    static String translate(String hungarian) {
        String teve = "";
        for (int i = 0; i < hungarian.length(); i++) {
            char c = hungarian.charAt(i);
            if (!isVowel(c)) {
                teve = teve + c;
            }else {
                teve = teve + c + "v" + c;

            }
        }
        return teve;
    }
}