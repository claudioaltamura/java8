package de.claudioaltamura.java8.defaultmethods.adapter;

/**
 * @author Claudio Altamura
 * @see http://www.claudioaltamura.de
 */
public class ExampleClient {

	public static void main(String[] args) {
		//classic way
		ExampleAdapterSimple exampleSimple = new ExampleAdapterSimple();
		exampleSimple.a();

		//Default Method 
		ExampleInterface exampleDefault = new ExampleInterfaceDefault() {};
		exampleDefault.a();
	}

}
