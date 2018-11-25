package aircraft;

public class Main {
    public static void main(String[] args) {
        Aircraft f16 = new F16();

        System.out.println(f16.getType());

        System.out.println(f16.refill(200));
        System.out.println(f16.getStatus());


        Aircraft f35 = new F35();
        System.out.println(f35.refill(120));
        System.out.println(f35.getStatus());
        System.out.println(f35.isPriority());


        Carrier home = new Carrier(500, 30);
        Carrier away = new Carrier(300, 12);

        home.addAircraft(new F16());
        home.addAircraft(new F35());
        home.addAircraft(new F16());
        home.addAircraft(new F35());

        away.addAircraft(new F16());
        away.addAircraft(new F35());
        away.addAircraft(new F16());
        away.addAircraft(new F35());


        home.fight(away);

        System.out.println(home.getStatus());
        System.out.println(away.getStatus());


    }
}
