package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point x = new Point(0, 0);
        Point y = new Point(2, 0);
        double expected = 2;
        Assert.assertEquals(expected, x.distance(y), 0.01);
    }

    @Test
    public void when01to20then2dot23() {
        Point x = new Point(0, 1);
        Point y = new Point(2, 0);
        double expected = 2.23;
        Assert.assertEquals(expected, x.distance(y), 0.01);
    }

    @Test
    public void when10to50then4() {
        Point x = new Point(1, 0);
        Point y = new Point(5, 0);
        double expected = 4;
        Assert.assertEquals(expected, x.distance(y), 0.01);
    }

    @Test
    public void when107to5418then12dot36() {
        Point x = new Point(1, 0, 7);
        Point y = new Point(5, 4, 18);
        double expected = 12.36;
        Assert.assertEquals(expected, x.distance3d(y), 0.01);
    }
}