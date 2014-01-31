package de.claudioaltamura.java8.lambda.parttwo.predicate;

import java.util.function.Predicate;

/**
 * @author Claudio Altamura
 * @see http://www.claudioaltamura.de
 */
public class PredicateOrExample {

	public static void main(String[] args) {
		Predicate<String> a = (input) -> input.contains("a");
		Predicate<String> b = (input) -> input.contains("b");
		
		System.out.println("test ac:" + a.or(b).test("ac"));
		System.out.println("test bc:" + a.or(b).test("bc"));
		System.out.println("test de:" + a.or(b).test("de"));

	}

}
