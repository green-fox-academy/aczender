public class TakesLonger {
    public static void main(String... args){
        //Solution with StringBuilder
        StringBuilder quote = new StringBuilder("Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.");
        quote.insert(21,"always takes longer than");

        System.out.println(quote);

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)



        // Solution without StringBuilder
        /*
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        System.out.println(quote.indexOf("It"));
        quote.substring(20);
        String newQuote = "always takes longer than" + quote.substring(20);
        System.out.println(quote .substring(0, 21)+newQuote);*/

    }
}
