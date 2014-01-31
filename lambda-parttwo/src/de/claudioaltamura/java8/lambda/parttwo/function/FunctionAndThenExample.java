package de.claudioaltamura.java8.lambda.parttwo.function;

import java.util.function.Function;

/**
 * @author Claudio Altamura
 * @see http://www.claudioaltamura.de
 */
public class FunctionAndThenExample {

	public static void main(String[] args) {
		Function<Integer, Integer> incrementer = (n) -> n + 1;
		Function<Integer, Integer> after = (n) -> n - 1;
		System.out.println(incrementer.andThen(after).apply(2));
	}

}
