package my_package;
public class ArabicCalcs extends Calculator {
    public ArabicCalcs(int number1, int number2) {
        super(number1, number2);
    }

    @Override
    public int addition() {
        return number1 + number2;
    }

    @Override
    public int subtraction() {
        return number1 - number2;
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
}


