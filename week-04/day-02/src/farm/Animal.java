package farm;

public class Animal {
    int hunger;
    int thirst;
    String name;

    public Animal(String name, int hunger) {
        this.hunger = hunger;
        this.name = name;
    }

    public void eat() {
        hunger -= 1;
    }

    public void drink() {
        thirst -= 1;
    }

    public void play() {
        thirst += 1;
        hunger += 1;
    }


}