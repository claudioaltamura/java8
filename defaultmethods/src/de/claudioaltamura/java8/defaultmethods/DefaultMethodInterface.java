package de.claudioaltamura.java8.defaultmethods;

public interface DefaultMethodInterface {

	void old();
	
	default void defaultMethod() {
		System.out.println("this is a default method");
	}
}
