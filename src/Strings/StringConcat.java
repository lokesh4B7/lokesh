package Strings;

import java.util.Scanner;

public class StringConcat {

	public static void main(String[] args) {
		String s1, s2, s3;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first name");
		s1 = sc.nextLine();
		System.out.println("enter the last name");
		s2 = sc.nextLine();
		s3 = s1 + s2;
		System.out.println("The full name is :" + s3);
		sc.close();
	}

}
