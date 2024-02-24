package OOps;

class A {
	String accountholdername = "Lokesh";
	int accountnum = 1234567;
	double availbalance = 2000;

	public void details()
	{
		System.out.println("AccountHolderName :" + accountholdername + " \nAccountnum :" + accountnum);
	}
}

class B extends A 
{
	double amount = 500;

	public void deposit() 
	{
		availbalance = availbalance + amount;
		System.out.println("Total balance after depositing Amt :" + availbalance);

	}
}

public class SingleLevelInheritance 
{
	public static void main(String[] args)
	{
		B b = new B();
		b.details();
		b.deposit();

	}

}
