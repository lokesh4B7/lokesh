package wrapperclass;

public class Boxing {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		// Wrapper classes/Boxing
		Integer obj1 = new Integer(5);
		
		Integer obj2 = new Integer("23");
		Float fobj1 = new Float(12.5f);
		Float fobj2 = new Float("14.2");
		Double dobj1 = new Double(85.6);
		Character cobj1 = new Character('q');

		// Displaying primitive data type as objects
		System.out.println("Integer object 1 value is " + obj1);
		System.out.println("Integer object 2 value is " + obj2);
		System.out.println("Float object 1 value is " + fobj1);
		System.out.println("Float object 2 value is " + fobj2);
		System.out.println("Double object 1 value is " + dobj1);
		System.out.println("Character object 1 value is " + cobj1);

	}

}
