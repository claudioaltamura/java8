package de.claudioaltamura.java8.lambda.partone;

/**
 * @author Claudio Altamura
 * @see http://www.claudioaltamura.de
 */
public class ThreadExample {

	public static void main(String args[]) {
		(new Thread(() -> {
			System.out.println("Hello !");
		})).start();
	}

}
