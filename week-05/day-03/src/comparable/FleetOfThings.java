package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();

        Thing milk = new Thing("Get milk");
        Thing obstacles = new Thing("Remove the obstacles");
        Thing standUp = new Thing("Stand up");
        Thing eatLunch = new Thing("Eat lunch");

        standUp.complete();
        eatLunch.complete();

        fleet.add(milk);
        fleet.add(obstacles);
        fleet.add(standUp);
        fleet.add(eatLunch);

        List<Thing> things = new ArrayList<>();

        things.add(milk);
        things.add(obstacles);
        things.add(standUp);
        things.add(eatLunch);


        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        //System.out.println(fleet);
        Collections.sort(things);
        System.out.println(things);

    }
}

