package de.claudioaltamura.java8.stream.example.student;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Claudio Altamura
 * @see http://www.claudioaltamura.de
 */
public class Student {

	private String name;
	
	private Map<Exam, Grade> exams = new HashMap<Exam, Grade>();

	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Map<Exam, Grade> getExams() {
		return exams;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", exams=" + exams + "]";
	}
	
}
