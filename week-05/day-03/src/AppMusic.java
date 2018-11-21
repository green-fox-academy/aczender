import main.java.music.*;

public class AppMusic {
    public static void main(String[] args) {

        System.out.println("Test 1, create Electric Guitar, Bass Guitar and Violin with default strings.");
        Electric_Guitar guitar = new Electric_Guitar();
        Bass_Guitar bassGuitar = new Bass_Guitar();
        Violin violin = new Violin();

        System.out.println("Test 1 Play");
        guitar.play();
        bassGuitar.play();
        violin.play();

        System.out.println("Test 2, create Electric Guitar, Bass Guitar with 7 and 5 strings .");
        Electric_Guitar guitar2 = new Electric_Guitar(7);
        Bass_Guitar bassGuitar2 = new Bass_Guitar(5);

        System.out.println("Test 2 Play");
        guitar2.play();
        bassGuitar2.play();
    }

}
