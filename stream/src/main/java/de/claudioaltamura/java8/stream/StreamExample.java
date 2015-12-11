package de.claudioaltamura.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Claudio Altamura
 * @see http://www.claudioaltamura.de
 */
public class StreamExample {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		final String[] namesData = { "Karl", "Micheal", "Yves", "Tom" };
		final List<String> names = Arrays.asList(namesData);

		//Verschiedene Wege Streams zu erzeugen
		final Stream<String> streamFromArray = Arrays.stream(namesData);
		final Stream<String> streamFromList = names.stream();
		
		final Stream<String> sequentialStream = names.stream();
		final Stream<String> parallelStream = names.parallelStream();

		final Stream<String> parallelArrayStream = Arrays.stream(namesData).parallel();

		final Stream<String> names2 = Stream.of("Tim", "Andy", "Mike");
		 // String
		final Stream<Integer> integers = Stream.of(1, 4, 7, 7, 9, 7, 2); // Integer
		final IntStream values = IntStream.range(0, 100);
		final IntStream chars = "This is a test".chars();

		List<String> filteredList = names.stream()
			.filter((str)-> { return str.startsWith("T") ? true : false;})
			.collect(Collectors.toList());
		System.out.println(filteredList);
	}

}
