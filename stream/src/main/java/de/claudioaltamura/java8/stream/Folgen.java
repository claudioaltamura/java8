package de.claudioaltamura.java8.stream;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Claudio Altamura
 * @see http://www.claudioaltamura.de
 */
public class Folgen {
	
	public static void main(String[] args) {
		final IntStream iteratingValues = IntStream.iterate(0, x -> x + 1);
		final AtomicInteger ai = new AtomicInteger(0);
		final Stream<Integer> generatedValues = Stream
				.generate(ai::getAndIncrement);
		final int[] firstTen = iteratingValues.limit(10).toArray();
		final Object[] secondTen = generatedValues.limit(10).toArray();
		System.out.println(Arrays.toString(firstTen));
		System.out.println(Arrays.toString(secondTen));
		System.out.println("Element type: "
				+ secondTen[0].getClass().getTypeName());
	}

}
