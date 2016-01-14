package de.claudioaltamura.java8.misc;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(final String[] args) {
		final List<String> wordList = Arrays.asList("Heinz", "Peter");
		final Map<String, Integer> wordCounts = new TreeMap<>();
		
		//A
		for (final String word : wordList) {
			wordCounts.putIfAbsent(word, 0);
			final Integer value = wordCounts.getOrDefault(word, 0);
			wordCounts.replace(word, value + 1);
		}

		System.out.println(wordCounts);

		// B
		for (final String word : wordList) {
			wordCounts.computeIfPresent(word, (str, val) -> val + 1);
			wordCounts.computeIfAbsent(word, (val) -> 1);
		}

		System.out.println(wordCounts);
		
		//C
		for (final String word : wordList)
		{
			wordCounts.merge(word, 1, Integer::sum);
		}
		System.out.println(wordCounts);
	}
}
