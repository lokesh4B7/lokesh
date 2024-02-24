package Strings;

import java.util.Scanner;

public class StringBufferExample1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		StringBuffer sb1 = new StringBuffer();
		// sb1= s.nextLine(); This is not at all possible
		System.out.println("Length Of String Buffer is  : " + sb1.length());
		System.out.println("Capacity Of String Buffer is  : " + sb1.capacity());

		/*
		 * sb.reverse() sb.append(String str) sb.insert(int offset, String str)
		 * sb.delete(int start, int end)
		 */
		while (true)
		{
			System.out.println("=== Enter Your Choice === ");
			System.out.println("1.append(str)\n2.reverse()\n3.insert(int,str)\n4.delete(int,int)\n5.Exit ");
			switch (Integer.parseInt(s.nextLine())) {
			case 1:

				System.out.println("Enter the String value to Append ot Buffer  : ");
				System.out.println("You are Trying to Append a String");
				System.out.println(sb1.append(s.nextLine()));
				break;

			case 2:
				System.out.println("You are Trying to Reverse a String");
				System.out.println(sb1.reverse());
				break;

			case 3:
				int i;
				System.out.println("Your choice is to Insert a string into exsiting string" + sb1.toString());
				System.out.println("Enter Index Value");
				i = Integer.parseInt(s.nextLine());
				if (i < sb1.length()) {
					System.out.println("Enter String Value");
					System.out.println(sb1.insert(i, s.nextLine()));
				} else {
					System.out.println("Index value should not excee lenght of String where is was : " + sb1.length());
				}
				break;

			case 4:
				int i1, i2;
				System.out.println("Enter Starting Index");
				i1 = Integer.parseInt(s.nextLine());
				System.out.println("Enter Ending Index");
				i2 = Integer.parseInt(s.nextLine());
				System.out.println("Your choice is to delete a string from index position " + i1 + " to " + i2);
				if (i1 < i2) {
					if (i1 < sb1.length() && i2 <= sb1.length()) {
						System.out.println("String Buffer after deleting is  :  " + sb1.delete(i1, i2));
					}
				}
				break;

			case 5:
				System.out.println("You have choosen to Exit");
				System.exit(0); // This method from System class will terminate the program.

			default:
				System.out.println("Invalid Choice");
				break;
			}

		}

	}
	
}
