package easy;

import easy.ABCheck;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ABCheckTest {

    ABCheck abCheck = new ABCheck();

    @Test
    void shouldReturnTrue() {
        assertEquals("true", abCheck.abChecker("hobby bar"));
        assertEquals("true", abCheck.abChecker("black band"));
        assertEquals("true", abCheck.abChecker("tear able"));
        assertEquals("true", abCheck.abChecker("and beer"));
    }
    @Test
    void shouldReturnFalse() {
        assertEquals("false", abCheck.abChecker("applicable"));
        assertEquals("false", abCheck.abChecker("home is so far"));
        assertEquals("false", abCheck.abChecker("flat belly"));
        assertEquals("false", abCheck.abChecker("bubble voyage"));
    }


}