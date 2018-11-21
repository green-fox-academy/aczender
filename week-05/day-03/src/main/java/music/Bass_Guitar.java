package main.java.music;

public class Bass_Guitar extends StringedInstrument {
    public Bass_Guitar() {
        super("Bass Guitar", 4);
    }

    public Bass_Guitar(int numberofStrings) {
        super("Bass Guitar", numberofStrings);
    }

    @Override
    public String sound() {
        return "Duum-duum-duum";
    }
}
