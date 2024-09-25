package my_package;

import java.util.Scanner;

public class lr1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Пожалуйста, введите арифметическое выражение через пробел" +
                "(например, 1 + 2 или I + II):");
        String expression = in.nextLine();

        String[] parts = expression.split(" ");
        if (parts.length != 3) {
            System.out.println("К сожалению, я могу работать только с двумя числами, попробуйте " +
                    "снова");
            return;
        }
        String number1 = parts[0];
        String operator = parts[1];
        String number2 = parts[2];

        boolean isArabic1 = NumberIdentifier.isArabicNumber(number1);
        boolean isArabic2 = NumberIdentifier.isArabicNumber(number2);

        if (isArabic1 != isArabic2) {
            System.out.println("К сожалению, вы ошиблись,оба числа должны быть в одной системе " +
                    "счисления");
            return;
        }

        Calculator calc;
        if (isArabic1) {
            calc = new ArabicCalcs(Integer.parseInt(number1), Integer.parseInt(number2));
        } else {
            calc = new RomanCalcs(number1, number2);
        }

        int result;
        switch (operator) {
            case "+":
                result = calc.addition();
                break;
            case "-":
                result = calc.subtraction();
                break;
            case "*":
                result = calc.multiplication();
                break;
            case "/":
                result = calc.division();
                if (result == -1) {
                    System.out.println("Увы,деление на ноль невозможно");
                    return;
                }
                break;
            default:
                System.out.println("Я не знаю таких операций");
                return;
        }

        if (isArabic1) {
            System.out.println("Результат: " + result);
        } else {
            System.out.println("Результат: " + RomanCalcs.toRoman(result));
        }
    }
}






