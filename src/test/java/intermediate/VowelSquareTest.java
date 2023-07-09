package intermediate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelSquareTest {

    VowelSquare vowelSquare = new VowelSquare();

    @Test
    void shouldReturn10() {
        String[] a = new String[] {"abcd", "eikr", "oufj"};
        assertEquals("1-0", vowelSquare.detectVowelSquarePosition(a));
    }

    @Test
    void shouldReturn1_2() {
        String[] a = new String[] {"ddabcd", "ccfikr", "vvoufj", "llkgai", "ssayon"};
        assertEquals("not found", vowelSquare.detectVowelSquarePosition(a));
    }

    @Test
    void shouldReturn12() {
        String[] b = new String[] {"aqrst", "ukaei", "ffooo"};
        assertEquals("1-2", vowelSquare.detectVowelSquarePosition(b));
    }

    @Test
    void shouldReturnNotFound() {
        String[] c = new String[] {"gg", "ff"};
        assertEquals("not found", vowelSquare.detectVowelSquarePosition(c));
    }

    @Test
    void shouldReturnNotFound2() {
        String[] b = new String[] {"aqrst", "ukaeh", "ffoko"};
        assertEquals("not found", vowelSquare.detectVowelSquarePosition(b));
    }
}