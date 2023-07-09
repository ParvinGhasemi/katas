package easy;

import easy.WordCount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordCountTest {
    WordCount wordCount = new WordCount();

    @Test
    void shouldReturnZeroForBlank() {
        assertEquals(0, wordCount.countWords(""));
    }

    @Test
    void shouldReturnCorrectNumber() {
        assertEquals(3, wordCount.countWords("coding is fun"));
        assertEquals(5, wordCount.countWords(" coding is fun and easy "));
        assertEquals(6, wordCount.countWords(" Practice makes better! a b c "));
    }

    @Test
    void shouldReturnZeroForOneSpace() {
        assertEquals(0, wordCount.countWords(" "));
    }
}