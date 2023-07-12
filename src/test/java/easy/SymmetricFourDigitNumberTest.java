package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SymmetricFourDigitNumberTest {
    SymmetricFourDigitNumber symmetricNumber = new SymmetricFourDigitNumber();

    @Test
    void is8008Symmetric() {
        assertTrue(symmetricNumber.isFourDigitNumberSymmetric(8008));
    }

    @Test
    void is5445Symmetric() {
        assertTrue(symmetricNumber.isFourDigitNumberSymmetric(5445));
    }

    @Test
    void is1313Symmetric() {
        assertFalse(symmetricNumber.isFourDigitNumberSymmetric(1313));
    }
}