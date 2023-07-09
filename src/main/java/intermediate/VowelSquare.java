package intermediate;

public class VowelSquare {

    // For this challenge you will determine if a square of vowels exists in a matrix.
/*
have the function VowelSquare(strArr) take the strArr parameter being passed which will be a 2D matrix of some arbitrary size filled with letters from the alphabet, and determine if a 2x2 square composed entirely of vowels exists in the matrix. For example: strArr is ["abcd", "eikr", "oufj"] then this matrix looks like the following:

a b c d
e i k r
o u f j

Within this matrix there is a 2x2 square of vowels starting in the second row and first column, namely, ei, ou. If a 2x2square of vowels is found your program should return the top-left position (row-column) of the square, so for this example your program should return 1-0. If no 2x2 square of vowels exists, then return the string not found. If there are multiple squares of vowels, return the one that is at the most top-left position in the whole matrix. The input matrix will at least be of size 2x2.
*/

    /*string A[] = { "abcd", "eikr", "oufj" }; => 1-0
    string B[] = { "aqrst", "ukaei", "ffooo" }; => 1-2
    string C[] = { "gg", "ff" }; => not found
    cout << VowelSquare(A, sizeof(A) / sizeof(A[0])) << endl; // 1-0
    cout << VowelSquare(B, sizeof(B) / sizeof(B[0])) << endl; // 1-2
    cout << VowelSquare(C, sizeof(C) / sizeof(C[0])) << endl; // not found*/

    public static String detectVowelSquarePosition(String[] stringArr) {

        char[][] charMatrix = new char[stringArr.length][stringArr[0].length()];

        for(int row = 0; row < stringArr.length; row++) {
            for(int column = 0; column < stringArr[0].length(); column++) {
                charMatrix[row][column] = stringArr[row].charAt(column);
            }
        }

        for(int row = 0; row < stringArr.length - 1; row++) {
            for(int col = 0; col < stringArr[0].length() - 1; col++) {
                if(isVowel(charMatrix[row][col])
                        && isVowel(charMatrix[row][col+1])
                        && isVowel(charMatrix[row+1][col])
                        && isVowel(charMatrix[row+1][col+1])) {
                    return row + "-" + col;
                }
            }
        }
        return "not found";
    }

    /*private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c== 'u';
    }*/

    private static boolean isVowel(char c) {
        String stringC = Character.toString(c);
        return stringC.matches("[aeiouAEIOU]");
    }
}
