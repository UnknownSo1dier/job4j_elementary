package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

public class MultiMaxTest {
    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(10, 4, 2);
        assertThat(result, is(10));
    }

    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(1, 4, 20);
        assertThat(result, is(20));
    }

    @Test
    public void whenAllEquals() {
        int result = MultiMax.max(5, 5, 5);
        assertThat(result, is(5));
    }

}