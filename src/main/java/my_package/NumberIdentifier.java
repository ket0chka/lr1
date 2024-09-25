package my_package;

public class NumberIdentifier {

    private static String[] Arabic = {
            "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"
    };
    private static String[] Romanian = {
            "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"
    };

    public static boolean isArabic(String number) {
        for (String ArabicNumb : Arabic) {
            if (ArabicNumb.equals(Arabic)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isRoman(String number) {
        for (String RomanNumb : Romanian) {
            if (RomanNumb.equals(Romanian)) {
                return true;
            }
        }
        return false;
    }
}
