package itmo.java;

import java.util.Scanner;

class Main {
    static Scanner in = new Scanner(System.in);
    public static void main( String[] args) {
        final Calculator calc = new Calculator();
        final int number1 = getNumber();
        final int number2 = getNumber();
        final char act = getOperation();
        System.out.println(calc.action(number1, number2, act));
    }
    
    /**
     * 
     * @return Число
     */
    static int getNumber() {
        System.out.print("Enter number: ");
        if (in.hasNextInt()) {
            return in.nextInt();
        }
        in.next();
        return 0;
    }

    /**
     * 
     * @return Операция
     */
    static char getOperation() {
        System.out.print("Enter operation: ");
        final char operation = in.next().charAt(0);
        return operation;
    }
}

class Calculator {
    int result;

    /**
     * 
     * @param number1 1 число
     * @param number2 2 число
     * @param act     Операция
     * @return Результат операции с числами
     */
    int action(final int number1, final int number2, final char act) {
        switch (act) {
            case '+':
                result = Actions.plus(number1, number2);
                break;
            case '-':
                result = Actions.minus(number1, number2);
                break;
            case '*':
                result = Actions.multiply(number1, number2);
                break;
            case '/':
                result = Actions.division(number1, number2);
                break;
            case '$':
                result = (int) Actions.root(number1, number2);
                break;
            case '^':
                result = (int) Actions.power(number1, number2);
                break;
            case '&':
                result = (int) Actions.squareOfSum(number1, number2);
                break;
            case '%':
                result = (int) Actions.squareOfDiff(number1, number2);
                break;
            default:
                result = 0;
                break;
        }
        return result;
    }
}

class Actions {
    /**
     * 
     * @param a 1 число
     * @param b 2 число
     * @return Сумма чисел
     */
    static int plus(final int a, final int b) {
        return a + b;
    }

    /**
     * 
     * @param a 1 число
     * @param b 2 число
     * @return Разность чисел
     */
    static int minus(final int a, final int b) {
        return a - b;
    }

    /**
     * 
     * @param a 1 число
     * @param b 2 число
     * @return Произведение чисел
     */
    static int multiply(final int a, final int b) {
        return a * b;
    }

    /**
     * 
     * @param a 1 число
     * @param b 2 число
     * @return Частное чисел
     */
    static int division(final int a, final int b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }

    /**
     * 
     * @param a число 
     * @param b степенной корень
     * @return корень степени b от a
     */
    static double root(final int a, final int b) {
        return Math.pow(a, 1 / b);
    }

    /**
     * 
     * @param a основание
     * @param b степень
     * @return a в степени b
     */
    static double power(final int a, final int b) {
        return Math.pow(a, b);
    }

    /**
     * 
     * @param a 1 число
     * @param b 2 число
     * @return квадрат суммы
     */
    static double squareOfSum(final int a, final int b) {
        return Math.pow(a + b, 2);
    }

    /**
     * 
     * @param a 1 число
     * @param b 2 число
     * @return квадрат разности
     */
    static double squareOfDiff(final int a, final int b) {
        return Math.pow(a - b, 2);
    }

}

//FiraCode: <= >= == !=
// qwe feature
