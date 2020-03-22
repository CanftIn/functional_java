package com.canftin.exercise.e03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionExample {
	public static final Function<Integer, Integer> triple = x -> x * 3;

	public static final Function<Integer, Integer> square = x -> x * x;

	public static final Function<Integer, Integer> compose(final Function<Integer, Integer> f1,
	                                                       final Function<Integer, Integer> f2) {
		return arg -> f1.apply(f2.apply(arg));
	}

	@Test
	public void testCompose() {
		assertEquals(Integer.valueOf(6), triple.apply(2));
		assertEquals(Integer.valueOf(4), square.apply(2));
		assertEquals(Integer.valueOf(36), square.apply(triple.apply(2)));
		assertEquals(Integer.valueOf(27), compose(triple, square).apply(3));
	}
}
