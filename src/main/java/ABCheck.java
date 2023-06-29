import java.util.stream.IntStream;

public class ABCheck {

    //EASY
    /*
    For this challenge you will determine if two characters are separated a specific way in the string.
    take the str parameter being passed and return the string true if the characters a and b are separated
    by exactly 3 places anywhere in the string at least once (i.e. "lane borrowed" would result in true
    because there is exactly three characters between a and b). Otherwise, return the string false.
    */

    //first solution
    /*
    public String abChecker(String text) {
        text.toLowerCase();

        for (int i = 0; i < text.length() - 4; i++) {
            if((text.charAt(i) == 'a' && text.charAt(i + 4) == 'b') || (text.charAt(i) == 'b' && text.charAt(i + 4) == 'a')) {
            return "true";
            }
        }
        return "false";
    }
    */


    //second solution
    public String abChecker(String text) {
        text.toLowerCase();
        boolean aThenB = IntStream.range(0, text.length()-4)
                .anyMatch(i -> text.charAt(i) == 'a' && text.charAt(i+4) == 'b');
        boolean bThenA = IntStream.range(0, text.length()-4)
                .anyMatch(i -> text.charAt(i) == 'b' && text.charAt(i+4) == 'a');

        return aThenB || bThenA ? "true" : "false";
    }
}
