package Strings;

import java.util.Scanner;

public class CountCapNSmall {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1;
		int capCount = 0, smallCount = 0, numCount = 0, spaceCount = 0;
		char ch;
		System.out.println("Enter the string");
		s1 = sc.nextLine();
		int length = s1.length();
		for (int index = 0; index < length; index++) {
			ch = s1.charAt(index);
			if (ch >= 'A' && ch <= 'Z') {
				capCount++;
			} else if (ch >= 'a' && ch <= 'z') {
				smallCount++;
			} else if (ch == 32) {
				spaceCount++;
			} else {
				numCount++;
			}
		}
		System.out.println("The Capital count is :" + capCount);
		System.out.println("The Small count is :" + smallCount);
		System.out.println("The Space count is :" + spaceCount);
		System.out.println("The Number's count is :" + numCount);
		sc.close();
	}
}
