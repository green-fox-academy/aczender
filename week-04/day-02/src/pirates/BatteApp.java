package pirates;

public class BatteApp {
    public static void main(String[] args) {
        Ship ship = new Ship();
        ship.fillShip();

        Ship otherShip = new Ship();
        otherShip.fillShip();

        ship.battle(otherShip);

        System.out.println(ship.getScore());
        System.out.println(otherShip.getScore());

        System.out.println(ship);
        System.out.println(otherShip);



    }
}
