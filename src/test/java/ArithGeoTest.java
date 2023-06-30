import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithGeoTest {

    ArithGeo arithGeo = new ArithGeo();

    @Test
    void shouldReturnArithmetic() {
        assertEquals("Arithmetic", arithGeo.defineTypeOfSequence(new int[] {2, 4, 6, 8}));
    }

    @Test
    void shouldReturnGeometric() {
        assertEquals("Geometric", arithGeo.defineTypeOfSequence(new int[] {2, 6, 18, 54}));
    }

    @Test
    void shouldReturn1() {
        assertEquals("-1", arithGeo.defineTypeOfSequence(new int[] {2, 5, 18}));
    }

    @Test
    void shouldThrowExceptionForTooShortArray() {
        assertThrows(IllegalArgumentException.class, () -> {
            arithGeo.defineTypeOfSequence(new int[] {2, 6});
        });
    }

    @Test
    void shouldThrowExceptionWithRightMessageForTooShortArray() {
        int[] array = {2, 6};

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            throw new IllegalArgumentException("Array length is too short.");
        });
        assertEquals("Array length is too short.", exception.getMessage());
    }


}