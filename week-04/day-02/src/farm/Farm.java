package farm;

import java.util.ArrayList;
import java.util.List;


public class Farm {
    int slot = 20;
    List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void breed() {
        int count = 0;
        for (int i = 0; i < animals.size(); i++) {
            count++;
        }
        System.out.println("free slots " + (slot - count));
        if ((slot - count) < 20) {
            animals.add(new Animal("chicken", 14));
        }
        System.out.println("slots " + (slot - animals.size()));
    }

    public void slaughter() {
        //Animal animal = animals.get(0);
        int min = animals.get(0).hunger;
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).hunger > min) {
                min = animals.get(i).hunger;
            }
        }
        for (int j = 0; j < animals.size(); j++) {
            if (animals.get(j).hunger == min) {
                animals.remove(animals.get(j));
            }

        }
    }
}


