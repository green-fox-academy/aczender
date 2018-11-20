package aircraft;

import java.util.ArrayList;

public class Carrier {
    int ammoStore;
    int healthPoints;
    ArrayList<Aircraft> aircrafts = new ArrayList<>();

    public Carrier(int ammoStore, int healthPoint) {
        this.ammoStore = ammoStore;
        this.healthPoints = healthPoint;
    }

    public void addAircraft(Aircraft aircraft) {
        aircrafts.add(aircraft);
    }

    public int requiredAmmo(){                          //the ammo we need
        int required = 0;
        for (int i = 0; i < aircrafts.size(); i++) {
            required = aircrafts.get(i).getMaxAmmo() - aircrafts.get(i).getAmmo();
        }
        return required;
    }


    public void fill() throws Exception {
        if (ammoStore == 0) {                           //if there is no ammo on store
            throw new Exception("no ammo left");        // throws an exception
        }else if (ammoStore >= requiredAmmo()){                   //if we have enough ammo
            for (int i = 0; i < aircrafts.size(); i++) {    //fill the aircraft elements
                aircrafts.get(i).refill(ammoStore);
                }

            } else
            for (int i = 0; i < aircrafts.size(); i++) {       //if store < required, don't have
                // enough
                if(aircrafts.get(i).isPriority()){              // fill the priority
                ammoStore = aircrafts.get(i).refill(ammoStore);
            }
        }

    }
}
