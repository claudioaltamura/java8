package de.claudioaltamura.java8.stream.terminal;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ToArrayGenerateExample {

	public static void main(final String[] args)
	{
		final Random random = new Random();
		
		final Supplier<Float> randomSupplier = () -> random.nextFloat() * 100;

		final Object[] randomNumbers = Stream.generate(randomSupplier).limit(7)
				.toArray();

		System.out.println(Arrays.toString(randomNumbers));

		System.out.println("Element type: " + randomNumbers[0].getClass());

		final int[] intRandoms = Stream.generate(randomSupplier).limit(7)
				.mapToInt(val -> val.intValue()).toArray();
		
		System.out.println(Arrays.toString(intRandoms));

	}

}
