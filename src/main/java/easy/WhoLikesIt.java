package easy;

import java.util.HashMap;
import java.util.Map;

public class WhoLikesIt {

/*  You probably know the "like" system from Facebook and other pages. People can "like" blog posts,
    pictures or other items. We want to create the text that should be displayed next to such an item.
    Implement the function which takes an array containing the names of people that like an item.
    It must return the display text as shown in the tests*/

    public static String likedBy(String... names) {
        int howManyPeopleLikedIt = names.length;
        return howManyPeopleLikedIt == 0 ? "no one likes this"
                : howManyPeopleLikedIt == 1 ? String.format("%s likes this", names[0])
                : howManyPeopleLikedIt == 2 ? String.format("%s and %s like this", names[0], names[1])
                : howManyPeopleLikedIt == 3 ? String.format("%s, %s and %s like this", names[0], names[1], names[2])
                : String.format("%s, %s and %d others like this", names[0], names[1], howManyPeopleLikedIt - 2);
    }


    // This is not my solution, but saw it on codewars and liked it:
    /*
    private static Map<Integer, String> choices = new HashMap<>();

    static {
        choices.put(0, "no one likes this");
        choices.put(1, "%s likes this");
        choices.put(2, "%s and %s like this");
        choices.put(3, "%s, %s and %s like this");
    }

    public static String likedBy(String... names) {
        int namesCount = names.length;
        return namesCount <= 3 ?
                String.format(choices.get(namesCount), names) :
                String.format("%s, %s and %s others like this", names[0], names[1], namesCount - 2);
    }
    */

}
