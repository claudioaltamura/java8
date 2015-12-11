package de.claudioaltamura.java8.stream.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Claudio Altamura
 * @see http://www.claudioaltamura.de
 */
public class FlatMap {

	public static void main(String[] args) {
		final List<String> sentences = Arrays.asList("ABC",
				"Die Katze lief im Schnee", "etc.");
		final Stream<String> asStream = sentences.stream();
		Stream<String> words = asStream.flatMap(line -> Stream.of(line.split(" ")));
		words.forEach(str -> System.out.println(str));
	}

}
