package petrolstation;

public class Car {
    int gasAmount;
    int capacity;

    public void Car(){
        gasAmount = 0;
        capacity = 100;
    }

    public static void main(String[] args) {
        Station chevy = new Station();

        chevy.refill();
        System.out.println(chevy.toString());
    }

}
