package ru.job4j.condition;

public class Games {
    public static void permission(boolean allowByParent, boolean hasMoney) {
        if (allowByParent == true) {
            System.out.println("I can go to the computer club.");
        } else {
            System.out.println("I can't.");
        }
        if (hasMoney == true) {
            System.out.println("I can go to the computer club.");
        } else {
            System.out.println("I can't.");
        }
        boolean rsl = allowByParent && hasMoney;
        System.out.println(rsl);
    }

    public static void main(String[] args) {
        Games.permission(true, true);
        Games.permission(true, false);
        Games.permission(false, true);
        Games.permission(false, false);
    }
}
