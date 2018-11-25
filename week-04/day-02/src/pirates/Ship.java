package pirates;

import java.util.ArrayList;
import java.util.List;


public class Ship {
    List<Pirate> pirates = new ArrayList<>();
    Pirate captain;


    public void fillShip() {
        this.captain = new Pirate();                           //adding a captain in the method
        pirates.add(captain);

        int piratesOnBoard = (int) ((Math.random() * 10) + 1);  //adding crew to the ship
        for (int i = 0; i < piratesOnBoard; i++) {
            Pirate pirate = new Pirate();
            pirates.add(pirate);
        }

    }

    public void captainState() {
        int lifeCaptain = (int) ((Math.random()) + 1);
        if (lifeCaptain <= 5) {                                       //captain's state
            System.out.println("The captain is dead");
        } else {
            System.out.println("The captain is alive");
        }
    }


    public int alivePirates() {                         //number of alive pirates in the crew
        int counter = 0;
        for (int i = 0; i < pirates.size(); i++) {
            if (! pirates.get(i).isDead) {
                counter++;
            }
        }
        return counter;

    }

    public int getScore() {                                 // score counter
        return alivePirates() - captain.getDrinkCounter();
    }

    public boolean battle(Ship otherShip) {
        if (getScore() > otherShip.getScore()) {
            otherShip.loser();
            party();
            return true;
        } else {
            otherShip.party();
            loser();
            return false;
        }

    }

    public void loser() {
        int loserDeath = (int) (Math.random() * pirates.size()) + 1;
        for (int i = 0; i < loserDeath; i++) {
            pirates.get(i).die();
        }
    }


    public void party() {
        int rumforWinner = (int) (Math.random() * pirates.size()) + 1;
        for (Pirate pirate : pirates) {
            pirate.drinkSomeRum(rumforWinner);
        }
        captain.drinkSomeRum(rumforWinner);
    }

    @Override
    public String toString() {
        return "The captain consumed; " + this.captain.drinkCounter + " and " + this.alivePirates() + " alive pirates.";

    }

}

