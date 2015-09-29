package de.claudioaltamura.java8.lambda.parttwo;

/**
 * @author Claudio Altamura
 * @see http://www.claudioaltamura.de
 */
public class Person {

	private String name;
	
	private int age;
	
	private Gender gender;
	
	public Person(String name) {
		this.name = name;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}
	
	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender)
	{
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender
				+ "]";
	}
	
	
	
}
