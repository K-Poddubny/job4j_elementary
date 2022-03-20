package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;
import static ru.job4j.math.MathFunction.multiply;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double minAndDev(double first, double second) {
        return minus(first, second)
                + dev(first, second);
    }

    public static double sumAllFunc(double first, double second) {
        return minus(first, second)
                + dev(first, second)
                + multiply(first, second)
                + sum(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + minAndDev(10, 20));
        System.out.println("Результат расчета равен: " + sumAllFunc(10, 20));
    }
}