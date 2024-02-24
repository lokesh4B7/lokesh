package Strings;

import java.util.Scanner;
import java.util.StringJoiner;

public class StringJoinerExample {
	public static void main(String[] args) {
		String s2, delimiter;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the delimiter");
		// delimiter=sc.nextLine();
		StringJoiner sj1 = new StringJoiner(sc.nextLine());
		System.out.println("Enter Birth Year");
		sj1 = sj1.add(sc.nextLine());
		System.out.println("Enter Birth Month");
		sj1 = sj1.add(sc.nextLine());
		System.out.println("Enter Day of Birth Month");
		sj1 = sj1.add(sc.nextLine());
		System.out.println("The lenght of String Joiner : " + sj1.length());
		System.out.println("Your Date Of Birth is : " + sj1.toString());
		sc.close();
	}

}
