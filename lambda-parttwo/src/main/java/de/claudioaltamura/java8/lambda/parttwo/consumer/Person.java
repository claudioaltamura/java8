package de.claudioaltamura.java8.lambda.parttwo.consumer;

/**
 * @author Claudio Altamura
 * @see http://www.claudioaltamura.de
 */
public class Person {

	private String name;
	
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public String toString() {
		return getName();
	}

}
