package de.claudioaltamura.java8.lambda.partone;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Examples {

	public static void main(String[] args) {
		final List<String> names = Arrays.asList("Andy", "Michael", "Max", "Stefan");

		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(final String str1, final String str2) {
				return Integer.compare(str1.length(), str2.length());
			}
		});

		//Type Inference
		@SuppressWarnings("unused")
		Comparator<String> compareByLength = (str1, str2) -> {
			return Integer.compare(str1.length(), str2.length());
		};

		// Lambda als Methodenparameter
		Collections.sort(names, (str1, str2) -> Integer.compare(str1.length(),
				str2.length()));

		// Alternative mit Lambda als Rückgabe einer Methode
		names.sort(compareByLength());
		
		names.sort( (str1, str2) -> Integer.compare(str1.length(), str2.length()) );
		names.forEach(it -> System.out.print(it.length() + ", "));
	}

	public static Comparator<String> compareByLength() {
		return (str1, str2) -> Integer.compare(str1.length(), str2.length());
	}

}
