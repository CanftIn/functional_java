package com.canftin.exercise.e07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionTest {
    public static final Function<Integer, Integer> triple = x -> x * 3;

    public static final Function<Integer, Integer> square = x -> x * x;

    @Test
    public void test() {
        assertEquals(Integer.valueOf(12), Function.<Integer, Integer, Integer>higherAndThen().apply(square).apply(triple).apply(2));
    }

    @Test
    public void test2() {
        assertEquals(Integer.valueOf(12), Function.<Integer, Integer, Integer>higherAndThen2().apply(square).apply(triple).apply(2));
    }
}
