public class Animal {

    int hunger = 20;
    int thirst = 20;
    private String name;


    public Animal(String name) {
        this.name = name;
    }

    public int getHunger() {
        return hunger;
    }

    public String getName() {
        return name;
    }


    public int eat() {
       return hunger -= 1;
    }

    public int drink() {
      return thirst -= 1;
    }

    public void play() {
        thirst += 1;
        hunger += 1;
    }


}
