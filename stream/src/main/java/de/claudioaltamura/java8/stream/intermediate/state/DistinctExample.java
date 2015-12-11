package de.claudioaltamura.java8.stream.intermediate.state;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Claudio Altamura
 * @see http://www.claudioaltamura.de
 */
public class DistinctExample {

	public static void main(final String[] args)
	{
		final Stream<Integer> distinct = createIntStream().distinct();
		final Stream<Integer> sorted = createIntStream().sorted();
		final Stream<Integer> sortedAndDistinct = createIntStream().sorted().distinct();

		printResult("distinct: ", distinct);
		printResult("sorted: ", sorted);
		printResult("sortedAndDistinct: ", sortedAndDistinct);
	}

	private static Stream<Integer> createIntStream()
	{
		return Stream.of(7, 1, 4, 3, 7, 2, 6, 5, 7, 9, 8);
	}

	private static void printResult(final String hint, final Stream<Integer> stream)
	{

		final List<Integer> result = stream.collect(Collectors.toList());

		System.out.println(hint + result);
	}

}
