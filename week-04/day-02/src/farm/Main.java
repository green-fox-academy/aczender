package farm;

public class Main {
    public static void main(String[] args) {

        Farm farm = new Farm();
        farm.addAnimal(new Animal("horse", 21));
        farm.addAnimal(new Animal("dog",30));
        farm.addAnimal(new Animal("cat",5));
        farm.addAnimal(new Animal("mouse",4));


        farm.breed();                       //adding 1 animal
        for (int i = 0; i < 5; i++) {       //slaughter method in action
            farm.slaughter();
        }

        System.out.println(farm);

    }
}
