package easy;

public class AsciiConversion {

    /*
    For this challenge you will be replacing certain characters in a string.
    have the function ASCIIConversion(str) take the str parameter being passed and
    return a new string where every character, aside from the space character, is
    replaced with its corresponding decimal character code. For example: if str is "dog" then
    your program should return the string 100111103 because d = 100, o = 111, g = 103.
    */

    public static String changeToAsciiValue(String text) {
        StringBuilder stringBuilder = new StringBuilder();

        for (char c : text.toCharArray()) {
            if (c != ' ') {
                stringBuilder.append((int) c);
            }
        }
        return stringBuilder.toString();
    }
}
