package ru.job4j.loop;

import java.time.Year;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        while (amount > 0) {
            amount = (amount + percent) - salary;
               year++;
            }
        return year;
    }
}