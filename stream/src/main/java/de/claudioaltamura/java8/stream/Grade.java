package de.claudioaltamura.java8.stream;

/**
 * @author Claudio Altamura
 * @see http://www.claudioaltamura.de
 */
public class Grade {

	private int grade;

	public Grade(int grade) {
		super();
		this.grade = grade;
	}

	public int getGrade() {
		return grade;
	}

	@Override
	public String toString() {
		return "Grade [grade=" + grade + "]";
	}

	
	
}
