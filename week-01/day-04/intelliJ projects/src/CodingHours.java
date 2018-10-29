public class CodingHours {
    public static void main(String[] args) {
        //daily coding hours
        int daily = 6;

        //weeks for coding in a semester
        int semester = 17;

        //number of workdays
        int workdays = 5;

        //hours spent coding in a semester (only workdays)
        int summary = (daily * workdays) * semester;
        System.out.println(summary);

        //average work hours weekly
        int weeklyHours = 52;

        System.out.println(summary / weeklyHours + "%");
    }
}
