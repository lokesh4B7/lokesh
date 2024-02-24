package Strings;

import java.util.Scanner;
import java.util.StringJoiner;

public class StringJoinerExample2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Delimiter Character");
		StringJoiner sj2 = new StringJoiner(s.nextLine());
		for (int i = 1; i <= 4; i++) {
			System.out.println("Enter Credit card number each time 4 digits");
			sj2 = sj2.add(s.nextLine());
		}
		System.out.println("Your Credit Card Number is : " + sj2.toString());
		System.out.println("Your Credit Card Number length is : " + sj2.length());
		s.close();
	}

}