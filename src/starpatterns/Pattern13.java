package starpatterns;

public class Pattern13
{

	public static void main(String[] args)
	{
		int s=4;
		for(int i=1;i<=5;i++)
		{
			//no of spaces
			for(int j=1;j<=s;j++)
			{
				System.out.print("");
			}
			//no of *'s
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			s--;
		}

	}

}
