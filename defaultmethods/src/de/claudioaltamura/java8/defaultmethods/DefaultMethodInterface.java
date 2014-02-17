package de.claudioaltamura.java8.defaultmethods;

/**
 * @author Claudio Altamura
 * @see http://www.claudioaltamura.de
 */
public interface DefaultMethodInterface {

	default void method() {
		System.out.println("this is a default method");
	}
}
