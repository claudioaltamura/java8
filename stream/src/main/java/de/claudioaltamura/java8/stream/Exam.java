package de.claudioaltamura.java8.stream;

public class Exam {

	private String name;

	public Exam(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}	
	
	@Override
	public String toString() {
		return "Exam [name=" + name + "]";
	}
	
}
