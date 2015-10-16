package de.claudioaltamura.bulkoperations;

import java.util.Arrays;
import java.util.List;

/**
 * @author Claudio Altamura
 * @see http://www.claudioaltamura.de
 */
public class ExternalIteration {

	public static void main(String[] args) {
		final List<String> names = Arrays.asList("Mike", "Peter");
		for(String name : names)
		{
			System.out.println(name);
		}

	}

}
