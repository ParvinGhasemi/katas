package intermediate;

import intermediate.ArrayDiff;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ArrayDiffTest {

    ArrayDiff arrayDiff = new ArrayDiff();

    @Test
    void shouldReturnFirstIfSecondIsBlank() {
        int[] a = new int[] {8, 1, 4};
        int[] b = new int[] {};
        assertArrayEquals(a, arrayDiff.difference(a, b));
    }

    @Test
    void shouldReturnBlankIfBothArraysAreEqual() {
        int[] a = new int[] {8, 1, 4};
        int[] b = new int[] {8, 1, 4};
        assertArrayEquals(new int[] {}, arrayDiff.difference(a, b));
    }

    @Test
    void shouldReturnTheDifferenceCorrectly() {
        int[] a = new int[] {1, 2};
        int[] b = new int[] {1};
        assertArrayEquals(new int[] {2}, arrayDiff.difference(a, b));
    }

    @Test
    void shouldRemoveAllOccurancesInA() {
        int[] a = new int[] {1, 2, 2, 2, 4};
        int[] b = new int[] {2};
        assertArrayEquals(new int[] {1, 4}, arrayDiff.difference(a, b));
    }
}