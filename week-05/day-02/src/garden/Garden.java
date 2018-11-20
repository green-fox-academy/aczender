package garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {
    ArrayList<Plant> plants = new ArrayList<>();

    public void addPlants(Plant plant) {
        plants.add(plant);
    }


    public void status() {
        for (int i = 0; i < plants.size(); i++) {
            plants.get(i).introduce();
        }
    }


    public void watering(double used) {
        List<Plant> toWatered = new ArrayList<>();
        for (int i = 0; i < plants.size(); i++) {
            if (plants.get(i).isNeedsWater()) {
                toWatered.add(plants.get(i));
            }
        }
        for (int i = 0; i < toWatered.size(); i++) {
            toWatered.get(i).water(used / toWatered.size());
            System.out.println(plants.get(i).introduce());
        }
    }
}

