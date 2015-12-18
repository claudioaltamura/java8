package de.claudioaltamura.java8.stream.terminal;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author Claudio Altamura
 * @see http://www.claudioaltamura.de
 */
public class WordCount {

	public static void main(String[] args) {
		final List<String> content = Arrays.asList("Hello and Goodbye.",
				"Test 123", "Test 3456", "Hello", "Goodbye.", "Cloudy day!",
				"day");
		final Stream<String> words = content.stream().flatMap(item -> Stream.of(item.split(" ")));
		
		final Predicate<String> notIsShortWord = word -> word.length() > 3;
		final Predicate<String> isSignificantWord = word -> !"Test".equalsIgnoreCase(word);
		final Stream<String> filteredContents = words
				.filter(notIsShortWord)
				.filter(isSignificantWord);

		final Function<String, String> removePunctationMarks = str ->
		{
			if (str.endsWith(".") || str.endsWith(":") || str.endsWith("!"))
			{
				return str.substring(0, str.length() - 1);
			}

			return str;
		};

		final Stream<String> mapped = filteredContents.map(removePunctationMarks);

		Function<String, String> identity = Function.identity(); // str -> str;
		Map<String, Long> grouped = mapped.collect(groupingBy(identity,	counting()));
		Map<String, Long> sorted = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

		sorted.putAll(grouped);

		System.out.println(sorted);
	}

}
