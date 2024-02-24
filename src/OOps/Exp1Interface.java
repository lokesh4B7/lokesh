package OOps;

interface A1
{
	public void m1();

}

interface B1 
{
	public void m1();
}

class C implements A1, B1
{
	public void m1() {
		System.out.println("it is main method");
	}
}

public class Exp1Interface
{
	public static void main(String[] args) 
	{
		C ob = new C();
		ob.m1();
	}
}
