package animal;

public class newAnimal {
    public static void main(String[] args) {
        Animal dog = new Animal();
        Animal wolf = new Animal();

        for (int i = 0; i < 3; i++) {
            dog.eat();
            wolf.drink();
        }

        System.out.println(dog.toString());
        System.out.println(wolf.toString());

    }

}
