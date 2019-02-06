package charsequence;

public class Main {
    public static void main(String[] args) {
        Gnirts s = new Gnirts("example");

        System.out.println(s.charAt(4));
        System.out.println(s.subSequence(3, 5));
        System.out.println(s.length());


        Shifter p = new Shifter("otherexample", 2);
        System.out.println(p.charAt(1));
        System.out.println(p.subSequence(3, 5));
        System.out.println(p.length());
    }
}
