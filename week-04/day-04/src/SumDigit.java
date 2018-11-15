public class SumDigit {
    public static void main(String[] args) {
        // Given a non-negative int n, return the sum of its digits recursively (no loops).
        // Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
        // divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
        System.out.println(sumOfDigits(345));

    }

    public static int sumOfDigits(int number) {
        int rightmost = number % 10;

        if (number == 0) {
            return rightmost;
        } else {
            return rightmost + sumOfDigits(number / 10);
        }
    }
}