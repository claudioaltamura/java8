package de.claudioaltamura.java8.methodreferences;


/**
 * @author Claudio Altamura
 * @see http://www.claudioaltamura.de
 */
public class Person {

	public enum Gender {
		MALE,
		FEMALE
	}
	
	private String name;
	private int age;
	private Gender gender;
	
	public Person(String name, int age, Gender gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public Gender getGender() {
		return gender;
	}
	
	public String toString() {
		return getName() + ", " + getAge();
	}

	public static boolean isMale(Person p) {
		return Person.Gender.MALE.equals(p.getGender());
	}

	public boolean isFemale(Person p) {
		return Person.Gender.FEMALE.equals(p.getGender());
	}
	
}
