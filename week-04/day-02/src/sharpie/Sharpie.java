package sharpie;

public class Sharpie {
    String color;
    float width;
    float inkAmount;

    public Sharpie() {
        this.inkAmount = 100f;
    }
    public void use(){
        inkAmount -= 20;
    }

    @Override
    public String toString() {
        return "Sharpie{" +
                "color='" + color + '\'' +
                ", width=" + width +
                ", inkAmount=" + inkAmount +
                '}';
    }
}
