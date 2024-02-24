package OOps;

abstract class Cal {
	abstract public void add(int i, int j);

	abstract public void sub(int i, int j);

	abstract public void mul(int i, int j);

	abstract public void div(int i, int j);
}

abstract class Operation extends Cal {
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

	abstract public void displayresult();
}

class Result extends Operation {
	public void displayresult() {
		add(10, 20);
		sub(10, 20);
		mul(10, 20);
		div(10, 20);
	}
}

public class DataAbstraction2 {
	public static void main(String[] args) {
		Result r = new Result();
		r.displayresult();
	}
}
