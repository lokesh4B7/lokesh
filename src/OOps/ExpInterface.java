package OOps;

interface Employee {
	void joiningProcess();

	void pF();

	void allocateWork();
}

class Infosys implements Employee {
	public void joiningProcess() {
		System.out.println("1.Selection \n2.Document Verification \n3.Send offer Letter");
	}

	public void pF() {
		System.out.println("As per the standard norm of EP");
	}

	public void allocateWork() {
		System.out.println("As per the vacancy avaliable");
	}
}

public class ExpInterface {
	public static void main(String[] args) {
		Infosys in = new Infosys();
		in.joiningProcess();
		in.pF();
		in.allocateWork();
	}
}
