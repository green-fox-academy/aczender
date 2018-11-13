package sharpie;

public class sharpieList {
    public static void main(String[] args) {
        Sharpie first = new Sharpie();
        first.color = "";
        first.width = 1.231f;

        first.use();

        System.out.println(first.toString());
    }

}
