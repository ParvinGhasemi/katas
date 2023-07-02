package easy;

public class ArithGeo {
    /*For this challenge you will determine if numbers within an array
    follow an arithmetic or geometric sequence.
    take the array of numbers stored in arr and return the
    string "Arithmetic" if the sequence follows an arithmetic pattern or
    return "Geometric" if it follows a geometric pattern. If the
    sequence doesn't follow either pattern return -1. An arithmetic sequence
    is one where the difference between each of the numbers is consistent,
    whereas in a geometric sequence, each term after the first is
    multiplied by some constant or common ratio.
    Arithmetic example: [2, 4, 6, 8] and Geometric example: [2, 6, 18, 54].
    Negative numbers may be entered as parameters, 0 will not be entered,
    and no array will contain all the same elements.*/

    public static String defineTypeOfSequence(int[] numbers) {
        final String ARITHMETIC_TYPE = "Arithmetic";
        final String GEOMETRIC_TYPE = "Geometric";
        final String NO_PATTERN = "-1";

        if (numbers.length < 3) {
            throw new IllegalArgumentException("Array length is too short.");
        }
        return isArithmetic(numbers) ? ARITHMETIC_TYPE
                : isGeometric(numbers) ? GEOMETRIC_TYPE
                : NO_PATTERN;
    }

    private static boolean isArithmetic(int[] numbers) {
        return numbers[1] - numbers[0] == numbers[2] - numbers[1] ? true : false;
    }

    private static boolean isGeometric(int[] numbers) {
        return numbers[1] / numbers[0] == numbers[2] / numbers[1] ? true : false;
    }

}
