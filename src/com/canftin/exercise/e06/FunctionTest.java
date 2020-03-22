package com.canftin.exercise.e06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionTest {
    public static final Function<Integer, Integer> triple = x -> x * 3;

    public static final Function<Integer, Integer> square = x -> x * x;

    @Test
    public void test() {
        assertEquals(Integer.valueOf(36), Function.<Integer, Integer, Integer>higherCompose().apply(square).apply(triple).apply(2));
    }
}
