package com.canftin.exercise.e05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionExample {
    public static final Function<Integer, Integer> triple = x -> x * 3;

    public static final Function<Integer, Integer> square = x -> x * x;

    public static final Function<Function<Integer, Integer>,
                                 Function<Function<Integer, Integer>,
                                          Function<Integer, Integer>>> compose =
                                                            x -> y -> z -> x.apply(y.apply(z));

    public static final Function<Integer, Integer> f = compose.apply(square).apply(triple);

    @Test
    public void test() {
        assertEquals(Integer.valueOf(81), f.apply(3));
    }
}
