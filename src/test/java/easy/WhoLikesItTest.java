package easy;

import easy.WhoLikesIt;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WhoLikesItTest {

    WhoLikesIt whoLikesIt = new WhoLikesIt();

    @Test
    public void likedByNoOne() {
        assertEquals("no one likes this", whoLikesIt.likedBy());
    }

    @Test
    public void likedByOnePerson() {
        assertEquals("Peter likes this", whoLikesIt.likedBy("Peter"));
    }

    @Test
    public void likedByTwoPeople() {
        assertEquals("Jacob and Alex like this", whoLikesIt.likedBy("Jacob", "Alex"));
    }

    @Test
    public void likedByThreePeople() {
        assertEquals("Max, John and Mark like this", whoLikesIt.likedBy("Max", "John", "Mark"));
    }

    @Test
    public void likedByFourPeople() {
        assertEquals("Alex, Jacob and 2 others like this", whoLikesIt.likedBy("Alex", "Jacob", "Mark", "Max"));
    }
}