package main.java.zoo;

public class Bird extends Animal {
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
}
