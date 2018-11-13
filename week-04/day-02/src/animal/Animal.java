package animal;

public class Animal {
    int hunger;
    int thirst;
    int eat;
    int drink;
    int play;

    public Animal() {
        this.hunger = 50;
        this.thirst = 50;
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

    @Override
    public String toString() {
        return "Animal{" +
                "hunger level " + hunger +
                ", thirst level " + thirst +
                '}';
    }
}