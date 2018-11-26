package flyable;

import main.java.zoo.Animal;

public class Bird extends Animal implements Flyable {
    String food;

    public Bird(String name, String food) {
        super(name);
        this.food = food;
    }


    @Override
    public String breed() {
        return "laying eggs.";
    }

    @Override
    public String eat() {
        return this.food;
    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void takeoff() {

    }
}
