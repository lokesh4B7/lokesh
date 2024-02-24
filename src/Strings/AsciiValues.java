package Strings;

import java.util.Scanner;

public class AsciiValues {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1;
		char ch;
		System.out.println("Enter the string");
		s1 = sc.nextLine();
		for (int i = 0; i < s1.length(); i++) {
			ch = s1.charAt(i);
			int ascii = (int) ch;
			System.out.print(ch + " ");
			System.out.print(ascii + "|");
		}
		sc.close();
	}
}