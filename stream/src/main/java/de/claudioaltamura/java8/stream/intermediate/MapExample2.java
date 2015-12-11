package de.claudioaltamura.java8.stream.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @author Claudio Altamura
 * @see http://www.claudioaltamura.de
 */
public class MapExample2 {

	public static void main(String[] args) {
		List<String> contents = Arrays
				.asList("Eins", "yes:", "okay", "no.", "si!");
		final Function<String, String> removePunctationMarks = str -> {
			if (str.endsWith(".") || str.endsWith(":") || str.endsWith("!")) {
				return str.substring(0, str.length() - 1);
			}
			return str;
		};
		final Stream<String> mapped = contents.stream()
				.map(removePunctationMarks);
		final Stream<String> sorted = mapped
				.sorted(String.CASE_INSENSITIVE_ORDER);
		sorted.forEach(it -> System.out.print(it + ", "));
	}
}
