package starpatterns;

public class Pattern7 
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


	}

}
