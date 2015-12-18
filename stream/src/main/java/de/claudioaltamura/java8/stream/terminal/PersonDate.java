package de.claudioaltamura.java8.stream.terminal;

import java.time.LocalDate;

/**
 * @author Claudio Altamura
 * @see http://www.claudioaltamura.de
 */
public class PersonDate {

	private String name;
	private LocalDate birthday;

	public PersonDate(String name, LocalDate birthday) {
		this.name = name;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	
}
