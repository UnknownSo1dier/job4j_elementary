package ru.job4j.calculator;

import org.junit.Test;

import org.junit.Assert;

public class FitTest {

    @Test
    public void whenManHeight188() {
        short height = 188;
        double expected = 101.2;
        double out = Fit.manWeight(height);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWomanHeight165() {
        short height = 165;
        double expected = 63.25;
        double out = Fit.womanWeight(height);
        Assert.assertEquals(expected, out, 0.01);
    }
}