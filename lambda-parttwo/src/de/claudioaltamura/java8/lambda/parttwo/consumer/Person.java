package de.claudioaltamura.java8.lambda.parttwo.consumer;

public class Person {

	private String name;
	
	public Person(String name) {
		this.name = name;
	}

	private String getName() {
		return name;
	}
	
	public String toString() {
		return getName();
	}

}
