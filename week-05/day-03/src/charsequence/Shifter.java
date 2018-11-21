package charsequence;

public class Shifter implements CharSequence {

    private String other;
    private int place;

    public Shifter(String name, int place) {
        this.other = name;
        this.place = place;
    }

    @Override
    public int length() {
        return other.length();
    }

    @Override
    public char charAt(int index) {
        return other.charAt(index + place);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return other.subSequence(start + place, end + place);
    }
}
