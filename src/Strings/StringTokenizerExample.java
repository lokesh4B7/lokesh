package Strings;

import java.util.StringTokenizer;
import java.util.Scanner;

public class StringTokenizerExample {
	public static void main(String[] args) {
		String s1, delimiter;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		s1 = sc.nextLine();
		System.out.println("enter the delimiter");
		delimiter = sc.nextLine();
		StringTokenizer st = new StringTokenizer(s1, delimiter);
		System.out.println("The number of tokens avaialble in given string is " + st.countTokens());// return the count
																									// of tokens
		String token;
		int n = 1;
		while (st.hasMoreTokens())// when there are no more token loop will exit.
		{
			token = st.nextToken(); // it will read the next token value, on first loop it is first token.
			StringBuffer sb1 = new StringBuffer(token);
			System.out.println("Token Number " + n + " is : " + token.toString());
			//System.out.println("|" + sb1.reverse());
			n++;
		}
		sc.close();
	}

}
