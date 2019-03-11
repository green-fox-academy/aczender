import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        System.out.println(bubble(new int[]{9, 12, 33, 1, 9, 5}));
    }

    public static String bubble(int[] ar) {
        int temp = 0;

        for (int i = ar.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (ar[j] > ar[j + 1]) {
                    temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                }
            }
        }
//        String bubles  = Arrays.toString(ar);
//        return bubles;
        return Arrays.toString(ar);
    }
}