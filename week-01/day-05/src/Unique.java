import java.util.Arrays;

public class Unique {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(duplicates()));
    }

    public static int[] duplicates() {
        int[] list = {4, 4, 5};
        for (int i = 0; i < list.length - 1; i++) {

            for (int j = i + 1; j < list.length; j++) {
                if (list[i] == list[j]) {
                    System.out.println(list[i]);
                }

            }
            for (int m = i; m < list.length; m++) {
                System.out.println(list[m] - list[i]);
            }}


        return list;
    }
}
