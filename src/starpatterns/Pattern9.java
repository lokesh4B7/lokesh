package starpatterns;

public class Pattern9 
{

	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			// no of spaces
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			//no of *'s
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			// no of spaces
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			//no of *'s
			for(int k=5;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}