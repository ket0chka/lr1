package my_package;

public abstract class Calculator {
    int number1;
    int number2;

    public Calculator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public abstract int addition();
    public abstract int subtraction();
    public abstract int multiplication();
    public abstract int division();

}
//
