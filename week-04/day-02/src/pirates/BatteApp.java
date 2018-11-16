package pirates;

public class BatteApp {
    public static void main(String[] args) {
        Ship ship = new Ship();

        ship.fillShip();
        Ship ship2 = new Ship();
        ship2.fillShip();


        ship.battle(ship2);
        ship.captainState();

        System.out.println(ship);
        System.out.println(ship2);

      // Pirate pirate = new Pirate();
        //pirate.brawl(pirate);


    }
}
