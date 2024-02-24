package starpatterns;

public class Pattern10 
{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			// no of spaces
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			//no of *'s
			for(int k=1;k<=5;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

		
	}

}
