package Strings;

import java.util.Scanner;

class Reverse1 {
	int length;
	char ch;
	String s2 = "";

	String findReverse(String s1) {
		length = s1.length();
		for (int index = length - 1; index >= 0; index--) {
			ch = s1.charAt(index);
			s2 = s2 + ch;
		}
		return s2;
	}
}

public class StringPalindrome {

	public static void main(String[] args) {
		String s1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		s1 = sc.nextLine();
		Reverse1 r = new Reverse1();
		String result = r.findReverse(s1);
		// System.out.println(result);
		if (result.equals(s1)) {
			System.out.println("this is palindrome");
		} else {
			System.out.println("this is  not palindrome");
		}
		sc.close();
	}

}
