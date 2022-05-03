package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] perf) {
        boolean result = true;
        for (int index = 0; index < perf.length; index++) {
            if (perf[index] != word[index]) {
                result = false;
            }
        }
        return result;
    }
}