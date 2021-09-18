package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void when12then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void when5102then10() {
        int result = Max.max(5, 10, 2);
        assertThat(result, is(10));
    }

    @Test
    public void when101060100then100() {
        int result = Max.max(10, 10, 60, 100);
        assertThat(result, is(100));
    }
}