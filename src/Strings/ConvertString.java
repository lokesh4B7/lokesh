package Strings;

import java.util.Scanner;

public class ConvertString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1, s2 = "";
		char ch;
		System.out.println("Enter the string");
		s1 = sc.nextLine();
		int length = s1.length();
		for (int index = 0; index < length; index++) {
			ch = s1.charAt(index);
			int ascii = (int) ch;
			if (ascii >= 65 && ascii <= 90) {
				ascii = ascii + 32;
				ch = (char) ascii;
				s2 = s2 + ch;
			} else if (ascii >= 97 && ascii <= 122) {
				ascii = ascii - 32;
				ch = (char) ascii;
				s2 = s2 + ch;
			} else {
				s2 = s2 + ch;
			}
		}
		System.out.println(s2);
		sc.close();

	}

}
