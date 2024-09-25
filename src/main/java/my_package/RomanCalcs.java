package my_package;

public class RomanCalcs extends Calculator {
    public RomanCalcs (int number1, int number2){
        super( number1,number2);
   }

    @Override
    public int multiplication() {
        return (number1*number2);
    }

    @Override
    public int division() {
        return (number1/number2);
    }

    @Override
    public int subtraction() {
        return (number1-number2);
    }

    @Override
    public int addition() {
        return (number1+number2);
    }

    }
