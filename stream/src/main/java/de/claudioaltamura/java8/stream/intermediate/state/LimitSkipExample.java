package de.claudioaltamura.java8.stream.intermediate.state;

import java.util.stream.IntStream;

public class LimitSkipExample {

	public static void main(final String[] args) {

		final IntStream iteratingValues = IntStream.iterate(0, x -> x + 1);

		final IntStream finalStream = iteratingValues.skip(50).limit(12); // =>
											// 50,51,52,53,54,55,56,57,58,59,60,61
		
		finalStream.forEach(i -> System.out.println(i));
	}
}
