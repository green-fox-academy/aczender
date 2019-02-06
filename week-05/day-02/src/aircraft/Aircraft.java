package aircraft;

public class Aircraft {
    private int ammo;
    private int maxAmmo;
    private int baseDamage;
    boolean priority;


    Aircraft(int maxAmmo, int baseDamage) {
        this.ammo = 0;
        this.maxAmmo = maxAmmo;
        this.baseDamage = baseDamage;
    }

    public int fight() {
        int damage = baseDamage * ammo;
        ammo = 0;
        return damage;
    }

    public int refill(int input) {
        int amountNeeded = this.maxAmmo - this.ammo;      //how much we need
        if (input <= amountNeeded) {
            this.ammo += input;
            return 0;
        } else {
            this.ammo = this.maxAmmo;               //if we cannot refill further
            return input - amountNeeded;                           //return the input
        }
    }

    public String getType() {
        return getClass().getSimpleName();
    }

    public String getStatus() {
        return "Type " + getType() + ", Ammo: " + ammo
                + ", Base Damage: " + baseDamage
                + ", All Damage: " + baseDamage * ammo;
    }

    public boolean isPriority() {
        return priority;
    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    public int getMaxAmmo() {
        return maxAmmo;
    }

    public void setMaxAmmo(int maxAmmo) {
        this.maxAmmo = maxAmmo;
    }
    public int getBaseDamage() {
        return baseDamage;
    }

}
