package OOps;

class Grandparent {
	String accountholdername = "Lokesh";
	int accountnum = 1234567;
	double availbalance = 2000;

	public void details() {
		System.out.println("AccountHolderName :" + accountholdername);
		System.out.println("Accountnum :" + accountnum);
	}
}

class Parent extends Grandparent {
	double amount = 500;

	public void deposit() {
		availbalance = availbalance + amount;
		System.out.println("Total balance after depositing Amt :" + availbalance);

	}
}

class Son extends Parent {
	double withdraw = 300;

	public void withdrawl() {
		availbalance = availbalance - withdraw;
		System.out.println("Total balance after withdrawing Amt :" + availbalance);
	}
}

public class MultiLevelInheritance {
	public static void main(String[] args) {
		Son s = new Son();
		s.details();
		s.deposit();
		s.withdrawl();

	}
}
