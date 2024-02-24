package exceptionhandling;

public class Exp1Exception 
{
	void display() 
	{
		try 
		{
			System.out.println("This is a try block for arithmetic exception");
			int a = 5 / 0;
			System.out.println("Exception started"); // This statement is not executed

		} 
		catch (ArithmeticException e)
		{
			System.out.println("Handles Exception using catch block");
		}

		try 
		{
			System.out.println("This is a try block for Null pointer exceotion");
			String s = null;
			System.out.println(s.length());
		} 
		catch (NullPointerException p) 
		{
			System.out.println("Handles Exception using catch block");
		}

		try 
		{
			System.out.println("This is a try block for NumberFormat exceotion");
			String s = "hello";
			int n = Integer.parseInt(s);
		} 
		catch (NumberFormatException n) 
		{
			System.out.println("Handles Exception using catch block");
		}

		try 
		{
			System.out.println("This is a try block for arrayindexoutofbounds exceotion");
			int arr[] = new int[5];
			arr[6] = 67;
		} 
		catch (ArrayIndexOutOfBoundsException a)
		{
			System.out.println("Handles Exception using catch block");
		}
	}

	public static void main(String[] args)
	{
		Exp1Exception e1 = new Exp1Exception();
		e1.display();
		System.out.println("main method ends");
	}
}
