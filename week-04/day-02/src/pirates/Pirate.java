package pirates;

public class Pirate {
    public boolean isDead;
    private int drinkCounter;
    private boolean isPassedOut;


    public Pirate(){
        this.isPassedOut = false;
        this.isDead = false;

    }

    public boolean isDead() {
        return isDead;
    }


    public boolean isPassedOut() {
        return isPassedOut;
    }


    public void drinkSomeRum(int rum) {
        if (!isDead) {
            drinkCounter++;
        } else {
            System.out.println("he's dead");
        }
    }

    public void howsItGoingMate() {
        if (drinkCounter < 5) {
            System.out.println("Pour me anudder");

        } else {
            isPassedOut = true;
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        }
    }

    public void die() {
        isDead = true;
    }

    public void brawl(Pirate otherPirate) {
        if (!this.isDead && !otherPirate.isDead) {
            int randomNumber = (int) ((Math.random() * 2) + 1);
            if (randomNumber == 1) {
                this.isDead = true;
            } else if (randomNumber == 2) {
                otherPirate.isDead = true;
            } else if (randomNumber == 3) {
                otherPirate.isPassedOut = true;
                this.isPassedOut = true;
                System.out.println("passed out");
            }

            System.out.println("the result is " + randomNumber);
        }

    }
    public int getDrinkCounter() {
        return drinkCounter;
    }

}
