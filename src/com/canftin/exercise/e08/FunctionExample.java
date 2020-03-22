package com.canftin.exercise.e08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionExample {
    public static <A, B, C> Function<B, C> partialA(A a, Function<A, Function<B, C>> f) {
        return f.apply(a);
    }

    @Test
    public void testPartialA() {
        Function<Integer, Function<Double, Double>> f = a -> b -> a * (1 + b / 100);
        Function<Double, Double> g = FunctionExample.partialA(89, f);

        assertEquals(f.apply(89).apply(7.0), g.apply(7.0));
        assertEquals(f.apply(89).apply(0.0), g.apply(0.0));
        assertEquals(f.apply(89).apply(16.65), g.apply(16.65));
    }
}
