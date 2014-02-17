package de.claudioaltamura.java8.defaultmethods.adapter;

/**
 * @author Claudio Altamura
 * @see http://www.claudioaltamura.de
 */
public abstract class ExampleAdapter implements ExampleInterface {

	@Override
	public abstract void a();

	@Override
	public void b() {
		System.out.println("b");
	}

}
