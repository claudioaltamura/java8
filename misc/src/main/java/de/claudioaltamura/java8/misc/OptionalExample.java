package de.claudioaltamura.java8.misc;

import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.Supplier;

public class OptionalExample {

	public static void main(final String[] args) {

		final Integer[] sampleValues = { 1, 3, 5, 7, 11, 13, 17, 19 };
		final Integer[] noValues = {};
		final Comparator<Integer> naturalOrder = Comparator.naturalOrder();
		final Optional<Integer> max = Arrays.stream(sampleValues).max(
				naturalOrder);
		Optional<Integer> min = Arrays.stream(noValues).min(naturalOrder);

		System.out.println("max: " + max);
		System.out.println("min: " + min);
		System.out.println("isPresent?: " + min.isPresent());

		final Integer maxValue = max.get();

		System.out.println("maxValue: " + maxValue);

		final Optional<Integer> optionalFromValue = Optional.of(4711);
		final Optional<Double> optionalFromNull = Optional.ofNullable(null);

		System.out.println("from Value: " + optionalFromValue);
		System.out.println("from null: " + optionalFromNull);

		min = Arrays.stream(noValues)
				.min(Comparator.naturalOrder());		
		min.ifPresent(System.out::println);
		System.out.println(min.orElse(-1));
		final Supplier<Integer> randomGenerator = () -> (int) (100 * Math.random());

		System.out.println(min.orElseGet(randomGenerator));
		min.orElseThrow(() -> new NoSuchElementException("there is no minimum"));
	}

}
