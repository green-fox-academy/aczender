package counter;

public class Counter {
    int c;
    int basicValue;

    public Counter() {
        basicValue = 0;
        c = basicValue;
    }

    public int get() {
        return c;
    }

    public void add(int i) {
        c += i;
    }

    public void add() {
        c += 1;
    }

    public void reset() {
        c = basicValue;
    }

    public Counter(int i) {
        basicValue = i;
        c = i;
    }
}
