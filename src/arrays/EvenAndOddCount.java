package arrays;

import java.util.Scanner;

public class EvenAndOddCount 
{
	public static void main(String[] args) 
	{
		int evencount = 0, oddcount = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size you want");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.print("enter elements into an aray");
		for (int i = 0; i < n; i++) 
		{
		  arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++)
		{
			if (arr[i] % 2 == 0)
			{
				evencount++;
			}
		}
		for (int i = 0; i < n; i++) 
		{
			if (arr[i] % 2 != 0)
			{
				oddcount++;
			}
		}
		System.out.println("The even count is :" + evencount);
		System.out.println("The odd count is :" + oddcount);
		sc.close();

	}
}
