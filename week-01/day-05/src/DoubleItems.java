public class DoubleItems {
    public static void main(String[] args) {
        int[] numList = {3, 4, 5, 6, 7};
        foreach(numList);
    }

    public static void foreach(int[] amount) {
        for (int a : amount) {
            System.out.print(a*2 + " ");
        }
    }
}