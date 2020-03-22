package com.canftin.exercise.e04;

import com.canftin.exercise.listing.Function;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionExample {
	public static final Function<Integer, Function<Integer, Integer>> add = x -> y -> x + y;

	public static final BinaryOperator addOp = x -> y -> x + y;

	public static final BinaryOperator multOp = x -> y -> x * y;

	@Test
	public void test() {
		assertEquals(Integer.valueOf(8), add.apply(3).apply(5));
		assertEquals(Integer.valueOf(8), addOp.apply(3).apply(5));
		assertEquals(Integer.valueOf(15), multOp.apply(3).apply(5));
	}

}
