package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max3(int left, int right, int first) {
        return max(first, max(left, right));
    }

    public static int max4(int left, int right, int first, int second) {
        return max(second, max(first, max(left, right)));
    }

    public static void main(String[] args) {
        int rsl = Max.max(1, 3);
        System.out.println(rsl);
        int rsl2 = Max.max3(1, 3, 9);
        System.out.println(rsl2);
        int rsl3 = Max.max4(1, 3, 27, 65);
        System.out.println(rsl3);
    }
}
