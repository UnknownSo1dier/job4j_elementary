package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void when_1_2_then_2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void when_5_10_2_then_10() {
        int result = Max.max(5, 10, 2);
        assertThat(result, is(10));
    }

    @Test
    public void when_10_10_60_100_then_100() {
        int result = Max.max(10, 10, 60, 100);
        assertThat(result, is(100));
    }
}