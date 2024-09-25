package my_package;

public class NumberIdentifier {
    public static boolean isArabicNumber(String number) {
        try {
            Integer.parseInt(number);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isRomanNumber(String number) {
        return !isArabicNumber(number);
    }
}

