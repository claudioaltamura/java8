package de.claudioaltamura.java8.lambda.parttwo.function;

import java.util.function.Function;

/**
 * @author Claudio Altamura
 * @see http://www.claudioaltamura.de
 */
public class FunctionExample {

	public static void main(String[] args) {
		Function<Integer, Integer> incrementer = (n) -> n + 1;
		System.out.println(incrementer.apply(2));
	}

}
