package de.claudioaltamura.java8.stream.parallel;

import java.util.Arrays;
import java.util.function.IntBinaryOperator;

public class ParallelPrefixExample {

	public static void main(final String[] args)
	{

		final int[] numbers1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("Initial: " + Arrays.toString(numbers1));

		final IntBinaryOperator sum = (x, y) -> x + y;
		Arrays.parallelPrefix(numbers1, sum);
		System.out.println("sum: " + Arrays.toString(numbers1));

		final int[] numbers2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		final IntBinaryOperator fak = (x, y) -> x * y;

		Arrays.parallelPrefix(numbers2, fak);
		System.out.println("fak: " + Arrays.toString(numbers2));

	}
}
