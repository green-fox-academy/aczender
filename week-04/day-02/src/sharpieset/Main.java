package sharpieset;

import sharpieset.Sharpie;
import sharpieset.SharpieSet;

public class Main {
    public static void main(String[] args) {

        SharpieSet sharpieset = new SharpieSet();
        sharpieset.addSharpie(new Sharpie("black"));
        sharpieset.addSharpie(new Sharpie("red"));

        sharpieset.countUsable();
        sharpieset.removeTrash();
        sharpieset.printAll();
    }

}
