import java.util.ArrayList;
import java.util.Arrays;



public class SolarSystem {
    public static void main(String[] args) {

        ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune"));

        System.out.println(putSaturn(planetList));

    }

    private static ArrayList<String> putSaturn(ArrayList<String> correct) {
        correct.add(5, "Saturn");
        return correct;
    }

}
