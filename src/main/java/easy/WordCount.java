package easy;

import java.util.Arrays;

  /*
  count the words. The tests will help how to do it.
  */

public class WordCount {

    public static int countWords(String text) {
        return text.equals("") || text.equals(" ") ? 0
                : (int) Arrays.stream(text.split(" ")).count();
    }
}
