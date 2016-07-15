package de.claudioaltamura.java8.misc.map;

import java.util.AbstractMap.SimpleEntry;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.google.common.collect.ImmutableMap;

public class InitializeHashMapStreamExample {
	
	public static void main(String[] args) {
		//Old fashion way
		Map<Integer, String> oldFashion = new HashMap<Integer, String>() {{
			put(1, "seite");
			put(2, "visit");
		}};
		System.out.println(oldFashion);
		
		//Java 8 Lambda way
		Map<Integer, String> map3 = Arrays.stream(
				new Object[][] {
						{ 1, "one" }, { 2, "two" }, })
						.collect(
								Collectors.toMap(kv -> (Integer) kv[0], kv -> (String) kv[1]));
		System.out.println(map3);

		//Or
		Map<Integer, String> myMap = Stream.of(
				new SimpleEntry<>(1, "one"),
				new SimpleEntry<>(10, "ten"))
				.collect(
						Collectors.toMap((se) -> (Integer) se.getKey(), (se) -> (String) String.valueOf(se.getValue()))
				);
		System.out.println(myMap);

		//Guava way
		ImmutableMap<Integer, String> guavaMap = ImmutableMap.of(
		        1, "one",
		        2, "two"
		);
		System.out.println(guavaMap);

		//Guava way with builder
		ImmutableMap<Integer, String> guavaMap2 = ImmutableMap.<Integer, String> builder()
				.put(1, "one").put(2, "two")
				.put(15, "fifteen").build();
		System.out.println(guavaMap2);
	}

}
