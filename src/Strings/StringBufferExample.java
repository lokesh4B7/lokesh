package Strings;

public class StringBufferExample {
	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer();
		System.out.println("The Length Of String Buffer SB1 is  :" + sb1.length());
		System.out.println("The capacity Of String Buffer SB1 is  :" + sb1.capacity());

		StringBuffer sb3 = new StringBuffer(100);
		System.out.println("The Length Of String Buffer SB3 is  :" + sb3.length());
		System.out.println("The capacity Of String Buffer SB3 is  :" + sb3.capacity());

		StringBuffer sb2 = new StringBuffer("Samudrala lokesh is a graduate");
		System.out.println("The Length Of String Buffer SB2 is  :" + sb2.length());
		System.out.println("The capacity Of String Buffer SB2 is  :" + sb2.capacity());

		// converting buffer object to string value.
		String s1;
		s1 = sb2.toString();
		System.out.println("This String value  is :" + s1);

		StringBuffer sb6 = new StringBuffer("LOKESH");
		// sb6 = sb6.append("harsha");
		System.out.println("String Buffer After Assigning a String is : " + sb6.append("Java"));

		StringBuffer sb = new StringBuffer("Hello");
		sb.append(", World");
		System.out.println(sb.toString());
		System.out.println(sb.length());

	}

}
