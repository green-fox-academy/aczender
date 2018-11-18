import java.util.Arrays;

public class Append_a {
    public static void main(String[] args) {
        String[] animals = {"koal", "pand", "zebr"};

     for (String a : animals) {
            System.out.print(a + "a ");
        }

        for (int i = 0; i < animals.length ; i++) {
            System.out.println(animals[i] + "a");
        }
    }

}
