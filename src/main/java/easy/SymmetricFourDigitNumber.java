package easy;

public class SymmetricFourDigitNumber {

    public static boolean isFourDigitNumberSymmetric(int fourDigitNumber) {
        String twoLeftDigits = String.valueOf(fourDigitNumber).substring(0, 2);
        String twoRightDigits = String.valueOf(fourDigitNumber).substring(2);
        String mirroredtwoRightDigits = new StringBuilder(twoRightDigits).reverse().toString();
        if (twoLeftDigits.equals(mirroredtwoRightDigits)) {
            return true;
        }
        return false;
    }
}
