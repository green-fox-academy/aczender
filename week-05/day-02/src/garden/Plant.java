package garden;

public class Plant {
    String color;
    double waterAmount;
    double absorb;
    int minimumWater;


    public Plant(String color) {
        this.color = color;
        waterAmount = 0;
    }

    public Plant() {

    }

    public void water(double arrived) {
        waterAmount = waterAmount + (arrived * absorb);
    }

    public boolean isNeedsWater() {
        return waterAmount <= minimumWater;
    }

    public String introduce() {
        String result = "The " + color + " " + getClass().getSimpleName() + " " + isNeedsWater();
        return result;
    }


}

