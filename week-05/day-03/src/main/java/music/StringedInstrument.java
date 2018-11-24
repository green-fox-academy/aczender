package main.java.music;

public abstract class StringedInstrument extends Instrument {
    protected int numberofStrings;


    public StringedInstrument(String name, int numberofStrings) {
        super(name);
        this.numberofStrings = numberofStrings;
    }

    @Override
    public void play() {
        System.out.println(this.name + ", a " + this.numberofStrings + "-stringed instrument that goes " + this.sound());

    }
    public abstract String sound();
}
