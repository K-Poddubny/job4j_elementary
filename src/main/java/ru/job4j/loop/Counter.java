package ru.job4j.loop;

import java.security.PublicKey;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int result = start; result <= finish; result++) {
            sum = sum + result;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int result = start; result <= finish; result++) {
            if (result % 2 == 0) {
                sum = sum + result;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));

        System.out.println(sumByEven(0, 10));
        System.out.println(sumByEven(3, 8));
        System.out.println(sumByEven(1, 1));
    }
}
