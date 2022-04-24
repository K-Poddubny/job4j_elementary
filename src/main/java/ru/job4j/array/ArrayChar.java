package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] perf) {
        boolean result = true;
        for (int index = 0; index < perf.length; index++) {
            for (int index2 = 0; index2 < word.length; index2++) {
                if (perf[index] == word[index2]) {
                    result = true;
                    break;
                } else {
                    result = false;
                }
            }
        }
        return result;
    }
}
