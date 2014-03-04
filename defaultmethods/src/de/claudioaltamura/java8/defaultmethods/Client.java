package de.claudioaltamura.java8.defaultmethods;

/**
 * @author Claudio Altamura
 * @see http://www.claudioaltamura.de
 */
public class Client{

	public static void main(String[] args) {
		//classic way
		MethodInterface classicWay = new MethodSimple();
		classicWay.method();

		//default method
		//Have you seen the extra {} ?
		DefaultMethodInterface defaultMethodInterface = new DefaultMethodInterface(){};
		defaultMethodInterface.method();
	}
}
