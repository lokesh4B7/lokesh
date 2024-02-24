package Strings;

import java.util.Scanner;

public class VowelsCount {

	public static void main(String[] args) {
		String s1;
		int vowelCount = 0, constCount = 0;
		int length;
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		s1 = sc.nextLine();
		length = s1.length();
		for (int index = 0; index < length; index++) {
			ch = s1.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowelCount++;

			}

			else {
				constCount++;

			}
		}
		System.out.println("The vowel count is :" + vowelCount);
		System.out.println("The consonant count is :" + constCount);
		sc.close();
	}

}
