package de.claudioaltamura.java8.lambda.parttwo.supplier;

import java.util.function.Supplier;

/**
 * @author Claudio Altamura
 * @see http://www.claudioaltamura.de
 */
public class SupplierExample {

	public static void main(String[] args) {
		Supplier<Integer> rndRange = () -> (int) (Math.random() * 100);
		System.out.println(rndRange.get());
	}

}
