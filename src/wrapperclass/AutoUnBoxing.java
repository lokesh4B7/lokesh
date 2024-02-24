package wrapperclass;

public class AutoUnBoxing {
	public static void main(String[] args) {
		// Boxing
	
		@SuppressWarnings("removal")
		Integer obj1 = new Integer(5);
		@SuppressWarnings("removal")
		Integer obj2 = new Integer("23");
		@SuppressWarnings("removal")
		Float fobj1 = new Float(12.5f);
		@SuppressWarnings("removal")
		Float fobj2 = new Float("14.2");
		@SuppressWarnings("removal")
		Double dobj1 = new Double(85.6);
		@SuppressWarnings("removal")
		Character cobj1 = new Character('q');

		// UnBoxing

		int a = obj1;
		int b = obj2;
		float c = fobj1;
		float d = fobj2;
		double e = dobj1;
		char ch = cobj1;

		// Displaying primitive data type as objects
		System.out.println("Integer object 1 value is " + a);
		System.out.println("Integer object 1 value is " + b);
		System.out.println("Float object 1 value is " + c);
		System.out.println("Float object 2 value is " + d);
		System.out.println("Double object 1 value is " + e);
		System.out.println("Character object 1 value is " + ch);

	}
}
