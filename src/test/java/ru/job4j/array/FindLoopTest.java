package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = {1, 4, 3, 5};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasNot10ThenMinus1() {
        int[] data = {1, 4, 3, 5};
        int el = 10;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas4Then0() {
        int[] data = new int[] {4, 10, 3};
        int el = 4;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDiapasonHas2Then3() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDiapasonHasNot8ThenMinus1() {
        int[] data = new int[] {3, 2, 4, 6, 2, 3, 1, 6, 9, 11, 12, 5, 3, 7};
        int el = 8;
        int start = 4;
        int finish = 11;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDiapasonHas4Then1() {
        int[] data = new int[] {1, 4, 2, 2, 1, 5};
        int el = 4;
        int start = 1;
        int finish = 4;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }
}