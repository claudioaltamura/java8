package de.claudioaltamura.java8.lambda.partone;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

/**
 * @author Claudio Altamura
 * @see http://www.claudioaltamura.de
 */
public class ComparatorExample2 {

	public static void main(String[] args) {
		// setup
		List<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(3);

		// classic way
		list.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer a, Integer b) {
				return a - b;
			}
		});
		System.out.println(list);

		// lambda way
		Comparator<Integer> lambdaComparator = (Integer a, Integer b) -> b - a;
		list.sort(lambdaComparator);
		System.out.println(list);

	}
}
