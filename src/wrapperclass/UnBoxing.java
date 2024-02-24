package wrapperclass;

public class UnBoxing {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		// Wrapping data Types of object/Boxing
		Integer obj1 = new Integer(5);
		Integer obj2 = new Integer("23");
		Float fobj1 = new Float(12.5f);
		Float fobj2 = new Float("14.2");
		Double dobj1 = new Double(85.6);
		Character cobj1 = new Character('q');

		// Unwrapping Data/UnBoxing
		int a = obj1.intValue();
		int b = obj2.intValue();
		float c = fobj1.floatValue();
		float d = fobj2.floatValue();
		double e = dobj1.doubleValue();
		char ch = cobj1.charValue();

		// Displaying primitive data type as objects
		System.out.println("Integer primitive data type value 1 is " + a);
		System.out.println("Integer primitive data type value 2 is " + b);
		System.out.println("Float primitive data type  value 1 is " + c);
		System.out.println("Float primitive data type  value 2 is " + d);
		System.out.println("Double primitive data type value 1 is " + e);
		System.out.println("Character primitive data type value 1 is " + ch);
	}

}
