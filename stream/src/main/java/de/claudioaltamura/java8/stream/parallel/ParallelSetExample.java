package de.claudioaltamura.java8.stream.parallel;

import java.util.Arrays;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

public class ParallelSetExample {

	public static void main(String[] args) {
		final int[] numbers = { 1, 3, 7, 15, 31, 63 };
		System.out.println("Initial: " + Arrays.toString(numbers));

		final IntUnaryOperator increment = i -> {
			return numbers[i] + 1;
		};

		Arrays.parallelSetAll(numbers, increment);
		System.out.println("Increment: " + Arrays.toString(numbers));

		final IntUnaryOperator specialMapping = i ->
		{
			final int value = numbers[i];
			return value < 10 ? (value / 2) : (value * 2);
		};

		Arrays.parallelSetAll(numbers, specialMapping);
		System.out.println("Converted: " + Arrays.toString(numbers));
		
		
		final String[] names = { "Andy", " Trim ", null, " Trim ", "Ralph" };

		System.out.println("Initial: " + Arrays.toString(names));
		final IntFunction<? super String> trimAndMapNullToNA = i ->
		{
			final String value = names[i];
			return value == null ? "-n/a-" : value.trim();

		};

		Arrays.parallelSetAll(names, trimAndMapNullToNA);
		System.out.println("Converted: " + Arrays.toString(names));
	}
}
