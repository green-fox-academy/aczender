package charsequence;

public class Gnirts implements CharSequence{

    private String name;

    public Gnirts(String name) {
        this.name = name;
    }

    @Override
    public int length() {
        return name.length();
    }
    private int fromEnd(int i) {                            //new method for fromEnd, so it can calculate from the end of the string
        return name.length() - 1 - i;
    }
    @Override
    public char charAt(int index) {
        //return name.charAt(index);                        //this would add back the normal order
        return name.charAt(name.length()-1-index);

    }

    @Override
    public CharSequence subSequence(int start, int end) {
        //return name.subSequence(start,end);
        StringBuilder sub =
                new StringBuilder(name.subSequence(fromEnd(end), fromEnd(start)));
        return sub.reverse();
    }
}
