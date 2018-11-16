package pirates;

public class Pirate {
    boolean isDead = false;
    int drinkCounter = 0;
    boolean isPassedOut = false;

    public void drinkSomeRum() {
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

}
