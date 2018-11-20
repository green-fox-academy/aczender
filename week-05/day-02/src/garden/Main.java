package garden;


public class Main {
    public static void main(String[] args) {
        Garden garden = new Garden();
        garden.addPlants(new Flower("yellow"));
        garden.addPlants(new Flower("blue"));
        garden.addPlants(new Tree("orange"));
        garden.addPlants(new Tree("purple"));
        Flower izé = new Flower("black");


        garden.watering(51);


    }
}
