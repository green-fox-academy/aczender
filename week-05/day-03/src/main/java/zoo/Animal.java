package main.java.zoo;

public abstract class Animal {
    protected String name;
    protected int age;
    protected String gender;
    protected String food;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String breed();

    public abstract String eat();
}
