package de.claudioaltamura.java8.misc;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class OptionalPrimitivesExample {
	
	public static void main(final String[] args) {

		final int[] sampleValues = {1,3,5,7,11,13,17,19};

		final OptionalInt min = Arrays.stream(sampleValues).min();

		final OptionalInt max = Arrays.stream(sampleValues).max();

		final OptionalDouble avg = Arrays.stream(sampleValues).average();

		System.out.println("min: " + min);
		System.out.println("max: " + max);
		System.out.println("avg: " + avg);
	}

}
