package petrolstation;

public class Station {
    int gasAmount = 0;
    int capacity = 100;

    public void refill() {
        gasAmount += 1;
        capacity -= 1;
    }

    @Override
    public String toString() {
        return "Station{" +
                "gasAmount=" + gasAmount +
                ", capacity=" + capacity +
                '}';
    }
}
