package de.claudioaltamura.java8.stream.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author Claudio Altamura
 * @see http://www.claudioaltamura.de
 */
public class MatchExample {

	public static void main(String[] args) {
		final List<String> names = Arrays.asList("Tina", "Shawn", "Micha");

		final Predicate<String> startWithT = str -> str.startsWith("T");

		final boolean allStartWithT = names.stream().allMatch(startWithT);

		final boolean anyStartWithT = names.stream().anyMatch(startWithT);

		final boolean noneStartWithT = names.stream().noneMatch(startWithT);

		System.out.println("allStartWithT: " + allStartWithT);

		System.out.println("anyStartWithT: " + anyStartWithT);

		System.out.println("noneStartWithT: " + noneStartWithT);	}

}
