package de.claudioaltamura.java8.lambda.parttwo.predicate;

import java.util.function.Predicate;

/**
 * @author Claudio Altamura
 * @see http://www.claudioaltamura.de
 */
public class PredicateAndExample {

	public static void main(String[] args) {
		Predicate<String> a = (input) -> input.contains("a");
		Predicate<String> b = (input) -> input.contains("b");
		
		System.out.println("test ac:" + a.and(b).test("ac"));
		System.out.println("test bc:" + a.and(b).test("bc"));
		System.out.println("test ab:" + a.and(b).test("ab"));

	}

}
