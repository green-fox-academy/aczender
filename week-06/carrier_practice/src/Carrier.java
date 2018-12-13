import java.util.ArrayList;


public class Carrier {
    private ArrayList<Aircraft> aircrafts;
    private int carrierAmmo;
    private int carrierHealth;

    public Carrier( int carrierAmmo, int carrierHealth) {
        aircrafts = new ArrayList<>();
        this.carrierAmmo = carrierAmmo;
        this.carrierHealth = carrierHealth;

    }

    void addAircraft(Aircraft aircraft) {
        aircrafts.add(aircraft);
    }

    public int requiredAmmo() {
        int count = 0;
        for (Aircraft aircraft : aircrafts) {
            count = aircraft.getMaxAmmo() - aircraft.getActualAmmo();
        }
        return count;
    }

    public void fill() throws Exception {
        if (carrierAmmo == 0) {
            throw new Exception("Storage is empy");

        } else if (capacity() < carrierAmmo) {
            for (Aircraft aircraft : aircrafts) {
                int remaining = aircraft.refill(carrierAmmo);
                carrierAmmo = remaining;
            }
        } else {
            for (Aircraft aircraft : aircrafts) {
                while (carrierAmmo != 0 && aircraft.isPriority()) {
                    carrierAmmo = aircraft.refill(carrierAmmo);
                }
            }

        }
    }

    int totalDamage() {
        int totalDamage = 0;
        for (Aircraft aircraft : aircrafts) {
            totalDamage = totalDamage + (aircraft.getBaseDamage() * aircraft.getActualAmmo());
        }
        return totalDamage;
    }

    public void fight(Carrier thatCarrier) {
        thatCarrier.carrierHealth -= totalDamage();
        for (Aircraft aircraft : aircrafts){
            aircraft.fight();
        }
    }

    int capacity() {
        int totalAmmo = 0;
        for (Aircraft aircraft : aircrafts) {
            totalAmmo += aircraft.getActualAmmo();
        }
        return totalAmmo;
    }

    String getStatus() {
        String status = "HP: " + carrierHealth + ", Aircraft count: " + aircrafts.size() + ", Ammo Storage: " + carrierAmmo + ", Total damage: " + totalDamage();
        for (Aircraft aircraft : aircrafts) {
            status += aircraft.getStatus();
        }
        return status;
    }
}

