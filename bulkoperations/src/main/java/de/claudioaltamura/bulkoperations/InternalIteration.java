package de.claudioaltamura.bulkoperations;

import java.util.Arrays;
import java.util.List;

public class InternalIteration {

	public static void main(String[] args) {
		final List<String> names = Arrays.asList("Mike", "Peter");
		
		names.forEach(name -> System.out.println(name));
	}
	
}
