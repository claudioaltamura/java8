package de.claudioaltamura.java8.lambda.parttwo.function;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionUsages {

	private static Supplier<List<String>> extractWordsFromFile(final Path inputFile)
	{
		return () ->
		{
			try
			{
				final List<String> lines = Files.readAllLines(inputFile);
				final Stream<String> words = lines.stream().flatMap(line ->
					Stream.of(line.split(" ")));
				final Function<String, String> removePunctationMarks =
						removePunctationMarks();
				final Stream<String> mapped = words.map(removePunctationMarks);
				final Stream<String> sorted = mapped.sorted(
						String.CASE_INSENSITIVE_ORDER);
			return sorted.collect(Collectors.toList());
			}
			catch (final Exception e)
			{
				return Collections.emptyList();
			}
		};
		
	}
		
	private static Function<List<String>, List<String>> removeIgnorableWords()
	{
		final List<String> wordsToIgnore = Arrays.asList("this", "This", "text");
		final Predicate<String> isIgnorable = word -> wordsToIgnore.contains(word);
	
	return input -> { return input.stream().filter(isIgnorable.negate())
			.collect(Collectors.toList()); 
		};
	}
	
	private static Function<List<String>, List<String>> removeShortWords()
	{
	final Predicate<String> isShortWord = word -> word.length() <= 3;
	final Predicate<String> notIsShortWord = isShortWord.negate();
	
	return input -> { return input.stream().filter(notIsShortWord)
			.collect(Collectors.toList()); 
		};
	}
		
	private static BiFunction<? super List<String>, ? super List<String>, ? extends List<String>> calcIntersection()
	{
		return (list1, list2) -> { list1.retainAll(list2); return list1; };
	}
	
	private static Function<String, String> removePunctationMarks()
	{
		final Function<String, String> removePunctationMarks = str ->
		{
			if (str.endsWith(".") || str.endsWith(":") || str.endsWith("!"))
			{
				return str.substring(0, str.length()-1);
			}
			return str;
		};
	
		return removePunctationMarks;
	}

}
