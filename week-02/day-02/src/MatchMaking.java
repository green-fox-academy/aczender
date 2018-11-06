import java.lang.ref.PhantomReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MatchMaking {

    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));



        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...


        System.out.println(makingMatches(girls, boys));
    }
    private static ArrayList<String> makingMatches(ArrayList<String> girls, ArrayList<String> boys) {
        ArrayList<String> party = new ArrayList<>();

        for (int i = 0; i < girls.size(); i++) {
            party.add(girls.get(i));
            party.add(boys.get(i));
        }

        return party;
    }
}
