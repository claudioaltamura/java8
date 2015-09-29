package de.claudioaltamura.java8.lambda.parttwo.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class RemoveAndReplace {

	public static void main(final String[] args)
	{
		final List<String> names = createDemoNames();
		// Spezialbehandlung von null-Werten
		final UnaryOperator<String> mapNullToEmpty = str -> str == null ? "" : str;
		names.replaceAll(mapNullToEmpty);
		// Leerzeichen abschneiden
		names.replaceAll(String::trim);
		// Leereinträge herausfiltern
		names.removeIf(String::isEmpty);
	
		System.out.println(names);

	}

	private static List<String> createDemoNames() {
		List<String> list = Arrays.asList("Johnny ", "Schaf", "Maus", null);		
		return list;
	}
	
}
