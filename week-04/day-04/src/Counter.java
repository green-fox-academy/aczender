public class Counter {
    // Write a recursive function that takes one parameter: n and counts down from n.
    public static void main(String[] args) {
        counter(3);
    }

    public static void counter(int n) {
        if (n > 0) {                        // BASE CASE - when n = 0 -> this condition is the
            // base case. where the recursion stops.
            counter(n - 1);
        }
        System.out.println(n);
    }
}
