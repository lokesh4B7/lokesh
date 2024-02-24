package Strings;

import java.util.Scanner;

public class CountString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1;
		int vowelCount = 0, constCount = 0, numCount = 0, spaceCount = 0;
		char ch;
		System.out.println("Enter the string");
		s1 = sc.nextLine();
		int length = s1.length();
		for (int index = 0; index < length; index++) {
			ch = s1.charAt(index);
			if ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
					|| (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
				vowelCount++;
			} else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				constCount++;
			} else if (ch == 32) {
				spaceCount++;
			} else {
				numCount++;
			}

		}
		System.out.println("The vowels count is :" + vowelCount);
		System.out.println("The consonant count is :" + constCount);
		System.out.println("The space count is :" + spaceCount);
		System.out.println("The numbers count is :" + numCount);
		sc.close();
	}

}
