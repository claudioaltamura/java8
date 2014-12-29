package de.claudioaltamura.java8.lambda.partone;

/**
 * @author Claudio Altamura
 * @see http://www.claudioaltamura.de
 */
public class HelloWorld {

	public static void main(String[] args) {
		Hello hello = (String name) -> {
			return "Hello " + name;
		};

		System.out.println(hello.greet("du!"));		
	}
	
}
