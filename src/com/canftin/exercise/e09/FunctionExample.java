package com.canftin.exercise.e09;

public class FunctionExample {

    public static <A, B, C> Function<A, C> partialB(B b, Function<A, Function<B, C>> f) {
        return a -> f.apply(a).apply(b);
    }
}
