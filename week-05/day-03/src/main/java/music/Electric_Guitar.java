package main.java.music;

public class Electric_Guitar extends StringedInstrument {
    public Electric_Guitar() {
        super("Electric Guitar", 6);
    }

    public Electric_Guitar(int numberofStrings) {
        super("Electric Guitar", numberofStrings);
    }

    @Override
    public String sound() {
        return "Twang";
    }
}
