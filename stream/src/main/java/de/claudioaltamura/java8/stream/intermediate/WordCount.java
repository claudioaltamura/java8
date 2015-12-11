package de.claudioaltamura.java8.stream.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Claudio Altamura
 * @see http://www.claudioaltamura.de
 */
public class WordCount {

	public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "hello", "bye", "ciao", "bye", "ciao");
            Map<String, Integer> counts = list.parallelStream().
                collect(Collectors.toConcurrentMap(
                    w -> w, w -> 1, Integer::sum));
            System.out.println(counts);
	}
}
