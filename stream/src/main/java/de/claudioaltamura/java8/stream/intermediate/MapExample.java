package de.claudioaltamura.java8.stream.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author Claudio Altamura
 * @see http://www.claudioaltamura.de
 */
public class MapExample {

	public static void main(String[] args) {
		// final Path exampleFile = Paths.get("src/main/resources/" +
		// "jdk8/streams/Example.txt");
		// final List<String> contents = Files.readAllLines(exampleFile);
		List<String> contents = Arrays
				.asList("Eins", "yes", "okay", "no", "si");
		final Stream<String> words = contents.stream().flatMap(
				line -> Stream.of(line.split(" ")));

		final Predicate<String> isShortWord = word -> word.length() <= 3;
		final Predicate<String> notIsShortWord = isShortWord.negate();
		final List<String> ignoreableWords = Arrays.asList("Eins");
		final Predicate<String> isIgnorableWord = word ->
		{
			return ignoreableWords.contains(word.toLowerCase());
		};
		
		final Predicate<String> isSignificantWord = isIgnorableWord.negate();
		final Stream<String> filteredContents = words.map(String::trim).
				filter(notIsShortWord).
				filter(isSignificantWord);
			filteredContents.forEach(it -> System.out.print(it + ", "));
	}
}
