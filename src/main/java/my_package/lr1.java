package my_package;

import java.util.Scanner;

public class lr1 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите первое число:");
            String number1 = in.nextLine();
            System.out.println("Введите второе число:");
            String number2 = in.nextLine();

            Converter converter = new Converter();

            int a = converter.Converter(number1);
            int f1 = converter.fl;

            int b = converter.Converter(number2);
            int f2 = converter.fl;

            if (a == -1 || b == -1) {
                System.out.println("Число не является арабским или римским, повторите ввод");
            } else {
                System.out.println("Пожалуйста, введите первое число: " + number1);
                System.out.println("Пожалуйста, введите второе число: " + number2);
                if (f1 != f2) {
                    System.out.println("Вид введенных чисел не совпадает, повторите попытку");
                } else {
                    System.out.println("Пожалуйста, определитесь, какую операцию " +
                            "над числами вы хотите совершить\n" +
                            "1) сложение\n 2) Вычитание\n " +
                            "3) Умножение\n 4) Деление\n");
                    int oper = in.nextInt();
                    if (oper < 1 || oper > 4) {
                        System.out.println("Вы совершили ошибку, я не могу выполнить ваш запрос");
                    } else {
                        Calculator calc;
                        if (f1 == 1) {
                            calc = new ArabicCalcs(a, b);
                        } else {
                            calc = new RomanCalcs(a, b);
                        }

                        int result;
                        switch (oper) {
                            case 1:
                                result = calc.addition();
                                break;
                            case 2:
                                 result = calc.subtraction();
                                 break;
                            case 3:
                                 result = calc.multiplication();
                                 break;
                            case 4:
                                 result = calc.division();
                            break;
                            default:
                                 result = -2;
                                 break;}
                            String resultString;
                            if (f1 == 1) {
                                resultString = Integer.toString(result);
                                System.out.println("Результат расчета: " + resultString);
                            }
                        }
                    }
                }
            }
        }






