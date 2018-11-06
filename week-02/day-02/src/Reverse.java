import static jdk.nashorn.internal.objects.NativeArray.reverse;

public class Reverse {
    public static void main(String... args) {
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
        String rev = reversedString(reversed);

        System.out.println(rev);

        //OPTIONAL SOLUTION
        /*String rev = new StringBuilder(reversed).reverse().toString();
        System.out.println(rev);*/

        // Create a method that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.


        // System.out.println(reverse(reversed));
    }

    //SOLUTION WITH CHARAT
    public static String reversedString(String reversed) {
        if (reversed.isEmpty())
            return reversed;
        return reversedString(reversed.substring(1)) + reversed.charAt(0);
    }


}
