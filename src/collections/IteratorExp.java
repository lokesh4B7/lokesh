package collections;

import java.util.*;

public class IteratorExp {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<>();
		a1.add("Python");
		a1.add("Java");
		a1.add("SQL");
		a1.add("C");

		// By using Iterator

		Iterator i2 = a1.iterator();
		System.out.println("Objects in forward direction");
		while (i2.hasNext()) {
			System.out.println(i2.next());
		}

		// By using Listiterator
		System.out.println("Objects in forward direction");
		ListIterator i1 = a1.listIterator();

		while (i1.hasNext()) {
			System.out.println(i1.next());
		}

		System.out.println("Objects in backward direction");
		while (i1.hasPrevious()) {
			System.out.println(i1.previous());
		}

	}

}
