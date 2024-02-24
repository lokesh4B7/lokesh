package OOps;

abstract class Calculator {
	abstract public void add(int i, int j);

	abstract public void sub(int i, int j);

	abstract public void mul(int i, int j);

	abstract public void div(int i, int j);
}

class Operations extends Calculator {
	public void add(int i, int j) {
		System.out.println(i + j);
	}

	public void sub(int i, int j) {
		System.out.println(i - j);
	}

	public void mul(int i, int j) {
		System.out.println(i * j);
	}

	public void div(int i, int j) {
		System.out.println(i / j);
	}
}

public class DataAbstraction {
	public static void main(String[] args) {
		Operations op = new Operations();
		op.add(10, 20);
		op.sub(10, 20);
		op.mul(10, 20);
		op.div(10, 20);
	}
}
