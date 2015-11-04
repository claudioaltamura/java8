package de.claudioaltamura.java8.stream.terminal;

import java.util.Arrays;
import java.util.stream.Stream;

public class ForEachExample {

	public static void main(final String[] args) {
		final String[] namesData = { "Karl", "Micheal", "Yves", "Tom" };
		final Stream<String> streamFromArray = Arrays.stream(namesData);
		streamFromArray.forEach(System.out::println);

		final Stream<String> streamFromArray2 = Arrays.stream(namesData);
		streamFromArray2.sorted().distinct().forEach(System.out::println);
	}

}
