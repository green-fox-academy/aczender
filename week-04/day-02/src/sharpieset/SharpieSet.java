package sharpieset;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    List<Sharpie> sharpies = new ArrayList<>();

    public void addSharpie(Sharpie sharpie) {
        sharpies.add(sharpie);
    }

    public void countUsable() {
        int count = 0;
        for (int i = 0; i < sharpies.size(); i++) {
            if (sharpies.get(i).inkAmount > 0) {
                count++;
            }

        }
        System.out.println("the usable amount of sharpies: " + count);
    }
    public void removeTrash() {
        for (int i = 0; i < sharpies.size(); i++) {
            if (sharpies.get(i).inkAmount <= 0) {
                sharpies.remove(i);

            }
        }

    }
    public void printAll(){
        for (int i = 0; i < sharpies.size(); i++) {
            System.out.println(sharpies.get(i).name);
            System.out.println(sharpies.get(i).inkAmount);
        }
    }
}
