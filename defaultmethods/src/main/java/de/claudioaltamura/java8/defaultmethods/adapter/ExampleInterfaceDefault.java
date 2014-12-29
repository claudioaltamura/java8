package de.claudioaltamura.java8.defaultmethods.adapter;

/**
 * @author Claudio Altamura
 * @see http://www.claudioaltamura.de
 */
public interface ExampleInterfaceDefault extends ExampleInterface {

	default void a() {
		System.out.println("a from ExampleInterfaceDefault");
	}
	
	default void b() {
		System.out.println("b from ExampleInterfaceDefault");		
	}
	
}
