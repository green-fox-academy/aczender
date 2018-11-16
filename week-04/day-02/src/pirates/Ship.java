package pirates;

import java.util.ArrayList;
import java.util.List;


public class Ship {
    List<Pirate> pirates = new ArrayList<>();
    private Pirate captain;

    public void addPirate(Pirate pirate) {
        pirates.add(pirate);
    }


    public void fillShip() {
        this.captain = new Pirate();

        int piratesOnBoard = (int) ((Math.random() * 10) + 1);
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
            if (!pirates.get(i).isDead) {
                counter++;
            }
        }
        return counter;

    }


    public boolean battle(Ship otherShip) {
        //random number for loser crew to determine deaths
        int scoreShip1 = this.alivePirates() - this.captain.drinkCounter;
        int scoreOtherShip = otherShip.alivePirates() - otherShip.captain.drinkCounter;

        int loserDeath = (int) (Math.random() * pirates.size()) + 1;
        for (int i = 0; i < loserDeath; i++) {
        }

        int party = (int) (Math.random()*10) + 1;
        for (int i = 0; i < party; i++) {
        }


        if (scoreShip1 > scoreOtherShip){
            System.out.println("First ship wins, " + loserDeath + " pirates died.");
        } else{
            System.out.println("Other ship wins");
        }

        return true;
    }

    @Override
    public String toString() {
        return "The captain consumed; " + this.captain.drinkCounter + " and " +
        this.alivePirates()  + " alive pirates.";

    }

}

