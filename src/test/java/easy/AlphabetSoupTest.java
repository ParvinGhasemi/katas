package easy;

import easy.AlphabetSoup;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlphabetSoupTest {
    AlphabetSoup alphabetSoup = new AlphabetSoup();

    @Test
    void shouldReturnHello() {
        assertEquals("ehllo", alphabetSoup.sortCharacters("hello"));
    }

    @Test
    void shouldReturnInOrder() {
        assertEquals("abcdeffghhh", alphabetSoup.sortCharacters("bhcfhgadehf"));
    }

    @Test
    void shouldReturnBaby() {
        assertEquals("abby", alphabetSoup.sortCharacters("baby"));
    }


}