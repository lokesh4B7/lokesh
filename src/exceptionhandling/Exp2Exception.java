package exceptionhandling;

public class Exp2Exception {
	public static void main(String[] args) {
		// Exception occurred or not
		try 
		{
			int arr[] = new int[3];
			arr[2] = 44;
		} 
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception handles");
		} 
		finally
		{
			System.out.println("finally block executed");
		}

		// Exception occurred and handled

		try {
			int arr[] = new int[3];
			arr[3] = 44;
		} 
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception handles");
		}
		finally
		{
			System.out.println("finally block executed");
		}

		// exception occurred not handled
		int arr[] = new int[3];
		try 
		{
			arr[3] = 44;
		}
		finally
		{
			System.out.println("finally block executed");
		}

	}

}
