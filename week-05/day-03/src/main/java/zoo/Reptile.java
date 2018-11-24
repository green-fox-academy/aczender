package main.java.zoo;

public class Reptile extends Animal {


    public Reptile(String name){
        super(name);

    }


    @Override
    public String breed() {
        return "laying eggs.";
    }

    @Override
    public String eat() {
        return null;
    }

    public void crawl(){}
}
