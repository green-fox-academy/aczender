package aircraft;

import java.util.ArrayList;

class Carrier {
    private int ammoStore;
    private int healthPoints;
    private ArrayList<Aircraft> aircrafts = new ArrayList<>();

    public Carrier(int ammoStore, int healthPoint) {
        this.ammoStore = ammoStore;
        this.healthPoints = healthPoint;
    }

    void addAircraft(Aircraft aircraft) {          //adding aircrafts to the list
        aircrafts.add(aircraft);
    }

    public int requiredAmmo() {                          //the ammo we need
        int required = 0;
        for (Aircraft aircraft : aircrafts) {
            required = aircraft.getMaxAmmo() - aircraft.getAmmo();
        }
        return required;
    }


    void fill() throws Exception {
        if (ammoStore == 0) {                           //if there is no ammo on store
            throw new Exception("no ammo left");        // throws an exception

        } else if (ammoStore < requiredAmmo()) {
            for (Aircraft aircraft : aircrafts) {
                if (aircraft.isPriority()) {                    // fill the priority
                    ammoStore = aircraft.refill(ammoStore);
                }
            }
        } else {                                            //fill the rest
            for (Aircraft aircraft : aircrafts) {
                ammoStore = aircraft.refill(ammoStore);
            }

        }

    }

    int totalAmmo() {
        int totalAmmo = 0;
        for (Aircraft aircraft : aircrafts) {
            totalAmmo = totalAmmo + aircraft.getAmmo();
        }
        return totalAmmo;
    }

    int totalDamage() {
        int totalDamage = 0;
        for (Aircraft aircraft : aircrafts) {
            totalDamage = totalDamage + (aircraft.getBaseDamage() * aircraft.getAmmo());
        }
        return totalDamage;
    }
//take another carrier as a refrence parameter and fire all the ammo from the aircrafts to it, than substract all the damage from it's health points

    void fight(Carrier other) {
        for (Aircraft aircraft : aircrafts) {
            other.healthPoints -= totalDamage();
        }
    }

    String getStatus() {
        String status = "HP: " + healthPoints + ", Aircraft count: " + aircrafts.size() + ", Ammo Storage: " + ammoStore + ", Total damage: " + totalDamage();
        for (Aircraft aircraft : aircrafts) {
            status += aircraft.getStatus();
        }
        return status;
    }
}

