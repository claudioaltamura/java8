package de.claudioaltamura.java8.lambda.partone;

/**
 * @author Claudio Altamura
 * @see http://www.claudioaltamura.de
 */
public class RunnableExample {

	public static void main(String[] args) {
		new Thread(getRunnable()).start();
	}

	public static Runnable getRunnable()
	{
		return () -> {
			System.out.println("Hello!");
		};
	}
}
