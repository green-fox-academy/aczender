public class NumberAdder {
    // Write a recursive function that takes one parameter: n and adds numbers from 1 to n.
    public static void main(String[] args) {
        counter(7);
    }
    public static int counter(int n) {
        System.out.println(n);
        if (n == 0) {
            return 0;
        }
        else {
            return n = n + counter(n - 1);
        }
    }
}
