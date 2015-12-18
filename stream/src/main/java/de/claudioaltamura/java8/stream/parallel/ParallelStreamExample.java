package de.claudioaltamura.java8.stream.parallel;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamExample {

	public static void main(String[] args) {
		final List<String> names = Arrays.asList("Lisa", "Maggie", "Peter",
				"Sam");

		names.parallelStream().sorted().forEach(System.out::println);

		names.parallelStream().sorted().forEachOrdered(System.out::println);
	}

}
