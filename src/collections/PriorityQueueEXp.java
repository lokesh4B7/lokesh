package collections;

import java.util.*;

public class PriorityQueueEXp {
	public static void main(String[] args) {
		PriorityQueue<String> a1 = new PriorityQueue<>();
		a1.add("ECE");
		a1.add("CSE");
		a1.add("EEE");
		a1.add("Mechanical");
		a1.add("CIVIL");
		a1.add("Lokesh");
		System.out.println(a1.peek());
		System.out.println(a1.poll());
		System.out.println(a1.contains("CSE"));
	}
}
