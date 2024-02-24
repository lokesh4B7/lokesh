package faq.programs;

class DemoBlocks1 {
	/*
	 * public static int a; static {
	 * System.out.println("=DemoBlocks==I am STATIC BLOCK in the Helper class===");
	 * }
	 */
	int a, b;

	DemoBlocks1(int a) {
		// this.a = a;
		System.out.println("Constructor with ONE Parameter  : ");
	}

	DemoBlocks1(int a, int b) {
		// this.a =a;
		this.b = b;
		System.out.println("Constructor with TWO Arguments  : ");

	}

	{
		a = 5;
		System.out.println("DemoBlocks==I am NON-STATIC BLOCK in the Helper class===");
	}

}

public class BlocksExample {
	// This is Block code
	/*
	 * static { System.out.println("===I am STATIC BLOCK in the Main class==="); }
	 */

	public static void main(String[] args) {
		// System.out.println("===I am Main Method=====");
		// DemoBlocks1 db1 = new DemoBlocks1();
		DemoBlocks1 db1 = new DemoBlocks1(5);
		DemoBlocks1 db2 = new DemoBlocks1(5, 10);
		System.out.println("db1 Object data  " + db1.a);
		System.out.println("db2 Object data  " + db2.a);
		System.out.println("db3 Object data  " + db2.b);

		// DemoBlocks1.a =20; // This is the place where class gets invoked and loaded
		// into memeory,. Then the static blocks of class will get executed.
	}
}