package easy;

import java.util.Arrays;

  /*
  count the words. Each word is separated with a space from another word.
  The tests will help how to do it.
  */

public class WordCount {

    //first solution
    public static int countWords(String text) {
        String trimmedText = text.trim();
        return trimmedText.equals("") || trimmedText.equals(" ") ? 0
                : (int) Arrays.stream(trimmedText.split(" ")).count();
    }


    public static void removeSpaces(String text) {
        String textWithNoSpaces = text.replace(" ", "");
    }
    


    //second solution
    /*
    public static int countWords(String text) {
        int counter = 0;

        if(text == "" || text == " ") {
            return 0;
        }

        for(char c : text.trim().toCharArray()) {
            if (Character.isSpaceChar(c)) {
                counter++;
            }
        }
        return counter + 1;
    }
    */
}
