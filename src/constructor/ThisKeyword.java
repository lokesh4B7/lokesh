package constructor;

public class ThisKeyword {
	public ThisKeyword() {
		this(4);
		System.out.println("This is 1st constructor");
	}

	public ThisKeyword(int n1) {
		this(5, 6);
		System.out.println("This is 2nd constructor");
		System.out.println(n1);
	}

	public ThisKeyword(int n1, int n2) {
		System.out.println("This is 3nd constructor");
		System.out.println(n1);
		System.out.println(n2);

	}

	public static void main(String[] args) {
		ThisKeyword tk = new ThisKeyword();

	}

}
