import java.util.Arrays;

public class AlphabetSoup {
    //EASY
    /*
    For this challenge you will be sorting characters in a string.
    take the str string parameter being passed and return the string with the letters in alphabetical order
    (i.e. hello becomes ehllo). Assume numbers and punctuation symbols will not be included in the string.
    */

    //first solution
    public static String sortCharacters(String text) {
        char[] textArray = text.toCharArray();
        Arrays.sort(textArray);
        return new String(textArray);
    }

    //second solution - using streams
    /*
    public static String sortCharacters(String text) {
        return text.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .sorted()
                .collect(Collectors.joining());
    }*/
}
