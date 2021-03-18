package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

public class PointTest {

    @Test
    public void distance() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 3);
        double rslAB = a.distance(b);
        double rslAC = a.distance(c);
        double rslBC = b.distance(c);
        assertThat(rslAB, closeTo(4, 0.001));
        assertThat(rslAC, closeTo(3, 0.001));
        assertThat(rslBC, closeTo(5, 0.001));
    }

    @Test
    public void distance3d() {
        Point a = new Point(1, 2, 4);
        Point b = new Point(0, 3,10);
        Point c = new Point(6, 6, 6);
        double rslAB = a.distance3d(b);
        double rslAC = a.distance3d(c);
        double rslBC = b.distance3d(c);
        assertThat(rslAB, closeTo(6.164, 0.001));
        assertThat(rslAC, closeTo(6.708, 0.001));
        assertThat(rslBC, closeTo(7.810, 0.001));
    }
}