package com.canftin.exercise.listing;

public interface Function<T, U> {
	U apply(T arg);

	default <V> Function<V, U> compose(Function<V, T> f) {
		return x -> apply(f.apply(x));
	}
}
