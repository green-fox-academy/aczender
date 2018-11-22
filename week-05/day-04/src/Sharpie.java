
public class Sharpie {
    String color;
    float width;
    float inkAmount = 100f;

    public Sharpie(float width, String color) {
        this.width = width;
        this.color = color;

    }

    public float use() {
        inkAmount -= 20;
        return inkAmount;
    }


}
