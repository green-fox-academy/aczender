public class Random {
    public static void main(String[] args) {
        // create a random number
        Double randomDouble = Math.random();
        System.out.println(randomDouble);

        // with integer
        int max = 50;
        int min = 2;
        Integer randomInt = (int) (Math.random() * (max - min) + 1) + min;
        System.out.println(randomInt);
    }
}
