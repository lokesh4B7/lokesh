package Strings;

public class MethodsInStringBuffer {

	public static void main(String[] args) {
		// 1)append():it is used to add the string at end of the orginal string.
		StringBuffer sb1 = new StringBuffer("Lokesh");
		sb1.append(" samudrala");
		System.out.println(sb1);

		// 2)insert():insert the string in the at any place in the string.
		StringBuffer sb2 = new StringBuffer("Graduate");
		sb2.insert(8, " in The stream of ECE");
		System.out.println(sb2);

		// 3)delete(): delete characters from start and end index value.
		StringBuffer sb3 = new StringBuffer("Sudheer Kumar");
		sb3.delete(0, 5);
		System.out.println(sb3);

		// 4)deleteCharAt():delete the characters at the specific index.
		StringBuffer sb4 = new StringBuffer("Hyderabad Biryani");
		sb4.deleteCharAt(4);
		System.out.println(sb4); // r deleted

		// 5)reverse():it reverse the string.
		StringBuffer sb5 = new StringBuffer("Hyderabad Biryani");
		System.out.println(sb5.reverse());

		// 6)compareTo():it compare the data present in both string contents. it returns
		// 0 for same otherwise -1.
		StringBuffer sb6 = new StringBuffer("Hello,world");
		StringBuffer sb61 = new StringBuffer("Hello,world");
		System.out.println(sb6.compareTo(sb61));

	}

}
