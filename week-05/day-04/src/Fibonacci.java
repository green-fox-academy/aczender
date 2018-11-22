public class Fibonacci {

    public static int counter(int n) {

        if (n == 0) {
            return 0;

        } else if (n == 2 || n == 1) {
            return 1;

        } else {
            return counter(n - 1) + counter(n - 2);
        }
    }
}
