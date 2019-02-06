package reservations;

public class Reservation implements Reservationy {
    private String dow;
    private String code;

    public Reservation() {
        this.dow = getDowBooking();
        this.code = getCodeBooking();
        System.out.println("Booking# " + this.code + " for " + this.dow);
    }

    public String getDow() {
        return dow;
    }

    @Override
    public String getDowBooking() {
        String[] dowArray = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        int random = (int) (Math.random() * 7);
        dow = dowArray[random];
        return dow;
    }

    @Override
    public String getCodeBooking() {
        String codeList = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String code = "";
        for (int i = 0; i < 8; i++) {
            int random = (int) (Math.random() * 35);
            code += codeList.substring(random, random + 1);
        }
        return code;
    }
    @Override
    public String toString() {
        return "Reservation{" +
                "code='" + code + '\'' +
                ", dow='" + dow + '\'' +
                '}';
    }


}
