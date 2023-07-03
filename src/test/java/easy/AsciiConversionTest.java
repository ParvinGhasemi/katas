package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AsciiConversionTest {

    AsciiConversion asciiConversion = new AsciiConversion();

    @Test
    void shouldReturnCorrectForDog() {
        assertEquals("100111103", asciiConversion.changeToAsciiValue("dog"));
    }

    @Test
    void shouldWorkForBlankString() {
        assertEquals("", asciiConversion.changeToAsciiValue(""));
    }

    @Test
    void shouldReturnBlankStringForASpace() {
        assertEquals("", asciiConversion.changeToAsciiValue(" "));
    }

    @Test
    void shouldReturnCorrectlyForStringWithSpace() {
        assertEquals("100111103", asciiConversion.changeToAsciiValue("d og"));
    }





}