package Strings;

import java.util.Arrays;

public class MethodsInString {

	public static void main(String[] args) {
		String s1 = "Lokesh";
		// 1)length():returns length of the string.
		System.out.println(s1);
		System.out.println("The length of the string is :" + s1.length());

		// 2)trim():it removes leading and trailing spaces in the given string.
		String s2 = " Lokisamudrala  ";
		System.out.println("The trim of the string is :" + s2.trim());

		// 3)toLowerCase():it converts string into lowercase.
		String s3 = "SUDHEER";
		System.out.println("The string is converted into lowercase is :" + s3.toLowerCase());

		// 4)toUpperCase():it converts string into uppercase.
		String s4 = "sudheer";
		System.out.println("The string is converted into uppercase is :" + s4.toUpperCase());

		// 5)toCharArray()
		String s5 = "Helloworld";
		System.out.println(s5.toCharArray());

		// 6)startsWith():It checks whether string starts with specified prefix or not.
		String s6 = "Brahmam";
		System.out.println(s6.startsWith("Br"));

		// 7)endsWith():It checks whether string starts with specified prefix or not.
		String s7 = "Brahmam";
		System.out.println(s7.endsWith("am"));

		// 8)contains():It checks the specified sequenced is present or not
		String s10 = "samudrala";
		System.out.println(s10.contains("ral"));

		// 9)equals():it compares data present in the given 2string is equal or not.
		String s11 = "HI";
		String s12 = "HI";
		String s13 = "hi";
		System.out.println(s11.equals(s12));
		System.out.println(s11.equals(s13));

		// 10)== :it compares address in the given 2string is equal or not.
		String s21 = "HI";
		String s22 = new String("HI");
		System.out.println(s21 == s22);

		// 11)equalsIgnoreCase():it returns true if both strings contains same data it
		// ignorecase.
		String s33 = "hi";
		String s32 = "HI";
		System.out.println(s33.equalsIgnoreCase(s32));

		// 12)replace():it replace the given string with new string.
		String str = "Lokesh";
		System.out.println(str.replace("Lokesh", "Samudrala"));
		System.out.println(str.replace("L", "7"));

		// 13)replaceAll():it replace the given string with new string.
		String str1 = "Lokesh";
		System.out.println(str1.replace("Lokesh", "Samudrala"));
		System.out.println(str1.replace("L", "7"));

		// 14)indexOf():it returns the index value of specified first character in the
		// given string. if not found returns -1.
		String str3 = "samudrala";
		System.out.println(str3.indexOf("a"));

		// 15)lastIndexOf():it returns the index value of specified last character in
		// the given string. if not found returns -1.
		String str4 = "samudrala";
		System.out.println(str4.lastIndexOf("a"));

		// 16)substring():It extract the part of the given string. based on starting
		// index value,ending index value.
		String str5 = "samudrala";
		System.out.println(str5.substring(1, 4));

		// 17)split():it split the string based on space/%/* etc.
		String str6 = "Hello How are you?";
		System.out.println(Arrays.toString(str6.split(" ")));

		// 18)charAt(index):it return the character at specified index value.
		String str7 = "Hello Guru";
		System.out.println(str7.charAt(4));

		// 19)valueOf():it converts string into integer.
		String str8 = "77";
		System.out.println("converts into integer" + Integer.valueOf(str8));
		int i = 99;
		System.out.println(String.valueOf(i));
		// 20)isEmpty(): it checks whether the string is empty or not based on length of
		// string.
		String sd = "";
		System.out.println(sd.isEmpty());
		String dd = " ";
		System.out.println(dd.isEmpty());
		// 21)isBlank():it checks whether the string is blank or not based on first trim
		// and length.
		String sd2 = "  i";
		System.out.println(sd2.isBlank());

	}
}
