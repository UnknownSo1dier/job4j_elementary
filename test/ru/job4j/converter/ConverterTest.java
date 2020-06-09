package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert600RblThen10Dollars() {
        int in = 600;
        int expected = 10;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }
}