package my_package;
public class RomanCalcs extends Calculator {
    int fl;

    public RomanCalcs(String number1, String number2) {
        super(romanToInt(number1), romanToInt(number2));
    }

    private static int romanToInt(String number) {
        switch (number) {
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "VI":
                return 6;
            case "VII":
                return 7;
            case "VIII":
                return 8;
            case "IX":
                return 9;
            case "X":
                return 10;
            default:
                throw new IllegalArgumentException("Неверное римское число: " + number);
        }
    }

    @Override
    public int multiplication() {
        return number1 * number2;
    }

    @Override
    public int division() {
        if (number2 == 0) {
            return -1;
        }
        return number1 / number2;
    }

    @Override
    public int subtraction() {
        return number1 - number2;
    }

    @Override
    public int addition() {
        return number1 + number2;
    }
    public static String toRoman(int number) {
        String[] romanSymbols = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return romanSymbols[number - 1];
    }
}