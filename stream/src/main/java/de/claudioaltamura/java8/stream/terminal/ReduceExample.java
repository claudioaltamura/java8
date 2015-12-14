package de.claudioaltamura.java8.stream.terminal;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author Claudio Altamura
 * @see http://www.claudioaltamura.de
 */
public class ReduceExample {

	public static void main(String[] args) {
		final Stream<String> names = Stream.of("Manni", "Tina", "Petra", "Christian");

		final Stream<Integer> integers = Stream.of(1, 2, 3, 4, 5);

		final Stream<Integer> empty = Stream.of();

		final Optional<String> stringConcat = names.reduce((s1,s2) -> s1 + ", " + s2);

		final Optional<Integer> multiplication = integers.reduce((s1,s2) -> s1 * s2);

		final Optional<Integer> addition = empty.reduce((s1,s2) -> s1 + s2);

		System.out.println("stringConcat: " + stringConcat);

		System.out.println("multiplication: " + multiplication);

		System.out.println("addition: " + addition);
	}

}
