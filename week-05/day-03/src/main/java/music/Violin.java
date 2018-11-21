package main.java.music;

public class Violin extends StringedInstrument {
    public Violin() {
        super("Violin", 4);
    }

    @Override
    public String sound() {
        return "Screech";
    }
}
