package de.claudioaltamura.java8.lambda.parttwo.function;

import java.util.function.Function;

public class FunctionComposeExample {

	public static void main(String[] args) {
		Function<Integer, Integer> incrementer = (n) -> n + 1;
		Function<Integer, Integer> before = (n) -> n * 2;
		System.out.println(incrementer.compose(before).apply(2));
	}

}
