package de.claudioaltamura.java8.lambda.partone;

import java.util.concurrent.Callable;

/**
 * @author Claudio Altamura
 * @see http://www.claudioaltamura.de
 */
public class CallableExample {

	public static void main(String args[]) {
		Callable<String> c = () -> "Hello you!";
		try {
			System.out.println(c.call());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
