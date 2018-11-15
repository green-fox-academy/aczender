public class Power {
    // Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
    public static void main(String[] args) {
        System.out.println(powerN(3, 2));
    }

    public static int powerN (int counter, int base) {
        if (base == 1) {
            return counter;
        } else {
            return counter * powerN(counter, base-1);
        }
    }

}
