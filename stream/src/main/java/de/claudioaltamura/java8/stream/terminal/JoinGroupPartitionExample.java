package de.claudioaltamura.java8.stream.terminal;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.partitioningBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author Claudio Altamura
 * @see http://www.claudioaltamura.de
 */
public class JoinGroupPartitionExample {

	public static void main(String[] args) {
		final List<String> names = Arrays.asList("Sti", "Rudolph", "Andreas", "Manni", "Fleur", "Moritz", "Bastian");
		final String joined = names.stream().sorted().collect(joining(", "));
		System.out.println(joined);
		Map<Integer, List<String>> grouped = names.stream().collect(groupingBy(String::length));
		for (Entry<Integer, List<String>> entry : grouped.entrySet())
		{
		    System.out.println(entry.getKey() + "/" + entry.getValue());
		}
		
		Map<Integer, Long> counting = names.stream().collect(groupingBy(String::length,	counting()));
		for (Entry<Integer, Long> entry : counting.entrySet())
		{
		    System.out.println(entry.getKey() + "/" + entry.getValue());
		}

		Map<Boolean, List<String>> partitions =	names.stream().filter(str -> str.contains("i")).collect(partitioningBy(str -> str.length() > 4));
		for (Entry<Boolean, List<String>> entry : partitions.entrySet())
		{
		    System.out.println(entry.getKey() + "/" + entry.getValue());
		}

	}
	
}
