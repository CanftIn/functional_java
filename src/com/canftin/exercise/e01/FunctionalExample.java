package com.canftin.exercise.e01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionalExample {

	public static final Function triple = new Function() {
		@Override
		public int apply(int arg) {
			return arg * 3;
		}
	};

	public static final Function square = new Function() {
		@Override
		public int apply(int arg) {
			return arg * arg;
		}
	};

	public static final Function compose(final Function f1, final Function f2) {
		return new Function() {
			@Override
			public int apply(int arg) {
				return f1.apply(f2.apply(arg));
			}
		};
	}

	@Test
	public void testCompose() {
		assertEquals(6, triple.apply(2));
		assertEquals(4, square.apply(2));
		assertEquals(36, square.apply(triple.apply(2)));
		assertEquals(27, compose(triple, square).apply(3));
	}
}
